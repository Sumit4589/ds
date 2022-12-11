package com.sam.inteview.epam;


import java.util.*;
import java.util.stream.Collectors;

interface TimeProvider {
    long getMillis();
}


public class CachingDataStructure {

    public class Node {
        public Node(String key, String value, long timeStamp) {
            this.key = key;
            this.value = value;
            this.timeStamp = timeStamp;
        }

        private String key;
        private String value;
        private Long timeStamp;

        public Long getTimeStamp() {
            return this.timeStamp;
        }

        @Override
        public String toString() {
            return key + " " + value + " " + timeStamp;
        }
    }

    private int maxSize;
    private TimeProvider timeProvider;

    public Map<String, Node> map;

    Queue<Node> queue;


    public CachingDataStructure(TimeProvider timeProvider, int maxSize) {
        this.timeProvider = timeProvider;
        this.maxSize = maxSize;
        map = new HashMap<>();
        Comparator<Node> timestampComparator = Comparator.comparing(Node::getTimeStamp);
        queue = new PriorityQueue<>(timestampComparator);
    }

    public void put(String key, String value, long timeToLeaveInMilliseconds) {
        if (key == null || value == null || timeToLeaveInMilliseconds < 0) {
            throw new IllegalArgumentException();
        }
        cleanup();
        Node node = new Node(key, value, timeProvider.getMillis() + timeToLeaveInMilliseconds);
        if (map.size() >= maxSize) {
            Node nodeCloseToExpiry = queue.poll();
            map.remove(nodeCloseToExpiry.key);
        }
        queue.add(node);
        map.put(key, node);
    }

    public Optional<String> get(String key) {
        if (key == null) {
            throw new IllegalArgumentException();
        }
        cleanup();
        return Optional.ofNullable(map.get(key)).map(node -> node.value);
    }

    public int size() {
        cleanup();
        return map.size();
    }

    private void cleanup() {
        List<Node> expiredNodes = map.values().stream()
                .filter(node -> node.getTimeStamp() < timeProvider.getMillis())
                .collect(Collectors.toList());
        expiredNodes.forEach(node ->
                removeNode(node)
        );
    }

    private void removeNode(Node node) {
        map.remove(node.key);
        queue.remove(node);
    }

}

