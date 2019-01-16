package SoftServe.Lesson4.HomeWork3.FirstB;

public class ThreeMinMax {

    private int min;
    private int max;
    private int A;
    private int B;
    private int C;

    public ThreeMinMax(int A, int B, int C) {
        this.A = A;
        this.B = B;
        this.C = C;

        if (A > B) {
            if (A > C) {
                this.max = A;
                if (B > C) {
                    this.min = C;
                } else {
                    this.min = B;
                }
            } else {
                this.max = C;
                if (A > B) {
                    this.min = B;
                } else {
                    this.min = A;
                }
            }
        } else if (B > C) {
            this.max = B;
            if (A > C) {
                this.min = C;
            } else {
                this.min = A;
            }
        } else {
            this.max = C;
            if (A > B) {
                this.min = B;
            } else {
                this.min = A;
            }
        }
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
