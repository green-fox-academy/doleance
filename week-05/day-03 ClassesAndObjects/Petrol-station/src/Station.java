public class Station {
    int gasAmount;

    public Station() {
        gasAmount = 5000;
    }

    public void refill(Car car) {
        if (this.gasAmount > (car.capacity - car.gasAmount)) {
            this.gasAmount -= car.capacity - car.gasAmount;
            car.gasAmount = car.capacity;
        }
    }
}
