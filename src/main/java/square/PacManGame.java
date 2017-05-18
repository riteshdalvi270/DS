package square;

/**
 * Created by ritesh on 5/17/17.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 	1. Shortest distance for lazy macpan to reach the cherries
 Pac-man is hungry and wants some cherries. He's too lazy to move right now,
 but he wants to make a mental note of which cherries are the closest.

 Inputs:
 1. Pac-man's location: base point (x, y)
 2. Location of cherries: a list of points, size N
 3. Integer k, where 0 < k < N

 Your task:
 1. Find the k closest points to the base point in the list.
 2. Want to do this reasonably fast, and we should talk about it.
 3. Answer can be unordered.
 4. Although we will test the solution with a few points, there can be a lot of points in practice.

 ^
 | k = 2
 |
 |
 |    . D
 |                  . F
 |          . C
 |
 |    -------------
 |    | . A       |
 |    |           |
 |    |       . B |
 |    -------------          . E
 |
 | . X
 -------------------------------->

 If X is the base point and k = 2, our answer would be A and B.

 k_nearest_points(
 base_point: (0, 0),
 list_of_points: [(2, 2), (1, 1), (3, 3), (0, 0), (5, 5), (4, 4)]
 k: 3
 ) = [(0, 0), (2, 2), (1, 1)]
 */
public class PacManGame {

    public static void main(final String args[]) {

        final Point pacMan = new Point(0,0);
        final List<Point> cherries = new ArrayList<>();
        cherries.add(new Point(2,2));
        cherries.add(new Point(1,1));
        cherries.add(new Point(3,3));
        cherries.add(new Point(0,0));
        cherries.add(new Point(3,3));
        cherries.add(new Point(5,5));
        cherries.add(new Point(4,4));

        int k =3;

        final List<Point> nearestPoint =  determineNearestPoint(pacMan,cherries,k);

        for(final Point p : nearestPoint) {

            System.out.println(p.x +","+p.y);
        }
    }

    public static List<Point> determineNearestPoint(final Point pacMan, final List<Point> cherries, int k) {

        final NearestDistance[] nearestDistances = new NearestDistance[cherries.size()];

        int count = 0;

        for(final Point cherry : cherries) {

            double distance = calculateDistance(pacMan,cherry);

            nearestDistances[count] = new NearestDistance(cherry,distance);

            count++;
        }

        final Heap heap = new Heap(nearestDistances.length);

        createHeap(heap,nearestDistances);

        List<Point> nearestPoint = new ArrayList<>();

        for(int i=0; i<k; i++) {
            nearestPoint.add(extractMinHeap(heap));
        }

        return nearestPoint;
    }

    private static Point extractMinHeap(final Heap heap) {

        NearestDistance nearestDistance = heap.nearestDistances[0];

        heap.nearestDistances[0] = heap.nearestDistances[heap.capacity-1];

        heap.capacity = heap.capacity -1;

        minHeapify(heap,0);

        return nearestDistance.p;
    }

    private static void createHeap(final Heap heap,final NearestDistance[] nearestDistances) {

        int count = 0;
        for(NearestDistance nearestDistance : nearestDistances) {

            heap.nearestDistances[count] = nearestDistance;
            count++;
        }

        heap.capacity = heap.nearestDistances.length;

        buildMinHeap(heap);
    }

    private static void buildMinHeap(final Heap heap) {

        int n = heap.size - 1;
        for(int i = n/2; i>=0; i--) {
            minHeapify(heap,i);
        }
    }

    private static void minHeapify(final Heap heap, int smallest) {

        int left = 2*smallest;
        int right = 2*smallest + 1;

        int i = smallest;

        if(left<heap.capacity && heap.nearestDistances[left].distance<heap.nearestDistances[i].distance) {
            i = left;
        }

        if(right < heap.capacity && heap.nearestDistances[right].distance<heap.nearestDistances[i].distance) {
            i = right;
        }

        if(i!=smallest) {
            exchange(heap.nearestDistances,smallest,i);
            minHeapify(heap,i);
        }
    }

    private static void exchange(NearestDistance[] nearestDistances, int smallest, int i) {

        NearestDistance temp = nearestDistances[smallest];
        nearestDistances[smallest] = nearestDistances[i];
        nearestDistances[i] = temp;
    }

    private static double calculateDistance(Point p1, Point p2) {

        return Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
    }

    static class Heap {
        private NearestDistance[] nearestDistances;
        int capacity;
        int size;

        public Heap(int n) {
            nearestDistances = new NearestDistance[n];
            size = n;
            capacity = 0;
        }
    }

    static class NearestDistance {

        double distance;
        Point p;

        NearestDistance(Point p, double distance) {
            this.p = p;
            this.distance = distance;
        }
    }

    static class Point {

        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
