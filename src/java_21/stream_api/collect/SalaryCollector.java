package java21.stream_api.collect;

public class SalaryCollector {
    private int total;
    private int count;

    public int getTotal() {
        return total;
    }

    public void accept(int sal) {
        total += sal;
        count++;
    }

    void combine(SalaryCollector salaryCollector) {
        total += salaryCollector.total;
        count += salaryCollector.count;
    }

    @Override
    public String toString() {
        return "SalaryCollector{" + "total=" + total + ", count=" + count + '}';
    }
}
