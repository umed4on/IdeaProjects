/**
 * Created by dehkon on 11.03.2017.
 */
public final class TestClass {
    private final int re;
    private final int im;

    public TestClass(int re, int im) {
        this.re = re;
        this.im = im;
    }

    public int getRe() {
        return re;
    }

    public int getIm() {
        return im;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestClass testClass = (TestClass) o;

        if (re != testClass.re) return false;
        return im == testClass.im;
    }

    @Override
    public int hashCode() {
        int result = re;
        result = 31 * result + im;
        return result;
    }
}
//if ( o instanceof TestClass)