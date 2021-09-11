package inf101.v20.balls;

import javafx.scene.paint.Paint;

/**
 * A class to represent bouncing balls
 */
public class Ball{

	/** Color of the ball's surface */
	private Paint color;
	/** The ball's position and speed in x direction. */
	private Motion xMotion;
	/** The ball's position and speed in y direction. */
	private Motion yMotion;
	/** Number of steps taken */
	private int steps = 0;
	/** Describes how well the ball bounces, needs to be between 0 and 1 */
	private double bounceFactor = 0.99;

	/**
	 * Create a new ball with position and velocity (0,0)
	 * 
	 * @param color
	 *            The color
	 * @param radius
	 *            The radius
	 */
	public Ball(Paint color, double radius) {
		if (radius < 0)
			throw new IllegalArgumentException("Radius should not be negative");
	}

	/**
	 * @return Current X position
	 */
	public double getX() {
	}

	/**
	 * @return Current Y position
	 */
	public double getY() {
	}
	
	/**
	 * @return The ball's radius
	 */
	public double getRadius() {
	}

	/**
	 * @return The ball's width (normally 2x {@link #getRadius()})
	 */
	public double getWidth() {
	}

	/**
	 * @return The ball's height (normally 2x {@link #getRadius()})
	 */
	public double getHeight() {
	}

	/**
	 * @return Paint/color for the ball
	 */
	public Paint getColor() {
	}

	/**
	 * Number of steps is used to determine the behavior of the ball
	 * 
	 * @return
	 */
	public int getSteps() {
	}

	/**
	 * Move ball to a new position.
	 * 
	 * After calling {@link #moveTo(double, double)}, {@link #getX()} will return
	 * {@code newX} and {@link #getY()} will return {@code newY}.
	 * 
	 * @param newX
	 *            New X position
	 * @param newY
	 *            New Y position
	 */
	public void moveTo(double newX, double newY) {
	}
	
	/**
	 * @return Current X movement
	 */
	public double getDeltaX() {
		return this.xMotion.getSpeed();
	}

	/**
	 * @return Current Y movement
	 */
	public double getDeltaY() {
		return this.yMotion.getSpeed();
	}
	
	/**
	 * Perform one time step.
	 * 
	 * For each time step, the ball's (xPos,yPos) position should change by
	 * (deltaX,deltaY).
	 */
	public void move() {
	}

	/**
	 * Indicate that the ball has hit something, and should move back and
	 * bounce.
	 * 
	 * If bounceX != 0 or bounceY != 0, then the ball has hit something in the X
	 * and/or Y direction and should reverse its movement.

	 * The (bounceX,bounceY) arguments can be added to the balls position in
	 * order to stop it from overlapping with whatever it hit.
	 * 
	 * @param bounceX X-distance the ball needs to move in order to not overlap with the object it hit
	 * @param bounceY Y-distance the ball needs to move in order to not overlap with the object it hit
	 */
	public void bounce(double bounceX, double bounceY) {
		if(bounceX == 0){
			xMotion.bounce(bounceX,bounceFactor);
		}
		if(bounceY != 0){
			//System.out.println("y bounce");
			yMotion.bounce(bounceY,bounceFactor);
		}
	}
	
	/**
	 * This method makes one ball explode into 8 smaller balls with half the radius
	 * @return the new balls after the explosion
	 */
	public Ball[] explode() {
		return null;
	}

	/**
	 * Changes the speed of this ball according to the rules for movement
	 * @param xAcceleration The extra speed along the x-axis
	 * @param yAcceleration The extra speed along the y-axis
	 */
	public void accelerate(double xAcceleration, double yAcceleration) {
	}

	/**
	 * Stops the motion of this ball
	 */
	public void halt() {
	}
}
