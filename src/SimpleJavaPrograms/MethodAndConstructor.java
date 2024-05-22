package SimpleJavaPrograms;

public class MethodAndConstructor {

	    private String make;
	    private String model;
	    private String color;
	    private int speed;
	    private boolean isEngineStarted;

	    public MethodAndConstructor(String make, String model, String color) {
	        this.make = make;
	        this.model = model;
	        this.color = color;
	        this.speed = 0;
	        this.isEngineStarted = true;
	    }

	    public void start() {
	        if (isEngineStarted) {
	            System.out.println("Starting the engine...");
	          //  isEngineStarted = true;
	        } else {
	            System.out.println("The engine is already running.");
	        }
	    }

	    public void stop() {
	        if (isEngineStarted) {
	            System.out.println("Stopping the engine...");
	            isEngineStarted = false;
	            speed = 0;
	        } else {
	            System.out.println("The engine is already stopped.");
	        }
	    }

	    public void accelerate(int increment) {
	        if (isEngineStarted) {
	            speed += increment;
	            System.out.println("Accelerating. Current speed: " + speed + " km/h");
	        } else {
	            System.out.println("Cannot accelerate. Start the engine first.");
	        }
	    }

	    public void brake(int decrement) {
	        if (isEngineStarted) {
	            if (speed - decrement >= 0) {
	                speed -= decrement;
	                System.out.println("Applying brakes. Current speed: " + speed + " km/h");
	            } else {
	                System.out.println("Car has already stopped.");
	            }
	        } else {
	            System.out.println("Cannot brake. Start the engine first.");
	        }
	    }

	    public static void main(String[] args) {
	    	MethodAndConstructor myCar = new MethodAndConstructor("Toyota", "Corolla", "Red");
	        System.out.println("My car is a " + myCar.color + " " + myCar.make + " " + myCar.model + ".");

	        myCar.start();
	        myCar.accelerate(30);
	        myCar.brake(10);
	        myCar.stop();
	    }

	     //Getters and setters
	    public String getMake() {
	        return make;
	    }

	    public void setMake(String make) {
	        this.make = make;
	    }

	    public String getModel() {
	        return model;
	    }

	    public void setModel(String model) {
	        this.model = model;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public int getSpeed() {
	        return speed;
	    }

	    public boolean isEngineStarted() {
	        return isEngineStarted;
	    }

}
