package create.prototype;

public class Computer {

    private final String processorType;
    private final Integer memorySize;
    private final Integer discSize;

    public Computer(String processorType, Integer memorySize, Integer discSize) {
        this.processorType = processorType;
        this.memorySize = memorySize;
        this.discSize = discSize;
    }

    public String getProcessorType() {
        return processorType;
    }

    public Integer getMemorySize() {
        return memorySize;
    }

    public Integer getDiscSize() {
        return discSize;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processorType='" + processorType + '\'' +
                ", memorySize=" + memorySize +
                ", discSize=" + discSize +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Computer(processorType, memorySize, discSize);
    }
}
