import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Interval {
	int start, end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}

public class MergeOveplappingIntervals {
	public static void main(String[] args) throws IOException {
		ArrayList<Interval> x = new ArrayList<Interval>();
		Interval i1 = new Interval(1, 3);
		Interval i2 = new Interval(15, 18);
		Interval i3 = new Interval(2, 6);
		Interval i4 = new Interval(8, 10);
		Interval i5 = new Interval(3, 9);
		x.add(i1);
		x.add(i2);
		x.add(i3);
		x.add(i4);
		x.add(i5);
		ArrayList<Interval> r = merge(x);
		for (Interval i : r) {
			System.out.println("[ " + i.start + " " + i.end + " ]");
		}
	}

	public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
		if (intervals.size() == 0 || intervals.size() == 1)
			return intervals;
		Collections.sort(intervals, new IntervalComparator());

		Interval first = intervals.get(0);
		int start = first.start;
		int end = first.end;

		ArrayList<Interval> result = new ArrayList<Interval>();

		for (int i = 1; i < intervals.size(); i++) {
			Interval current = intervals.get(i);
			if (current.start <= end) {
				end = Math.max(current.end, end);
			} else {
				result.add(new Interval(start, end));
				start = current.start;
				end = current.end;
			}
		}
		result.add(new Interval(start, end));
		return result;
	}
}

class IntervalComparator implements Comparator<Interval> {
	public int compare(Interval i1, Interval i2) {
		return (i1.start - i2.start);
	}
}