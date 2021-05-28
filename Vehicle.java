/*
* This class creates a vehicle.
*
* @author  Patrick Gemmell
* @version 1.0
* @since   2021-05-26
*/

/**
 * class vehicle.
 */
public class Vehicle {
  // Initializing fields
  /**
  * class vehicle.
  */
  private String licensePlate;
  /**
  * class vehicle.
  */
  private String colour;
  /**
  * class vehicle.
  */
  private int numberOfDoors;
  /**
  * class vehicle.
  */
  private int speed;
  /**
  * class vehicle.
  */
  private int maximumSpeed;

  /**
   * Setting field values with a constructor.
   * @param licensePlateInput
   * @param colourInput
   */
  public Vehicle(final String licensePlateInput,
                 final String colourInput) throws VehicleException {
    setLicensePlate(licensePlateInput);
    setColour(colourInput);
    this.numberOfDoors = FOUR;
    this.speed = 0;
    this.maximumSpeed = FSS;
  }
  /**
  * the number four.
  */
  public static final int FOUR = 4;
  /**
  * the number 477.
  */
  public static final int FSS = 477;

  /**
   * Setter for the colour.
   * @param userColour
   */
  public void setColour(final String userColour) throws VehicleException {
    if (userColour.equals("Red") || userColour.equals("Blue")
        || userColour.equals("Green") || userColour.equals("Yellow")) {
      colour = userColour;
    } else {
      throw new VehicleException("Error: Invalid car colour.");
    }
  }

  /**
   * Getter for the colour.
   * @return
   * returns colour
   */
  public String getColour() {
    return colour;
  }

  /**
   * Setter for the license plate number.
   * @param userLicensePlate
   */
  public void setLicensePlate(final String userLicensePlate) {
    licensePlate = userLicensePlate;
  }
  /**
   * Getter for the license plate number.
   * @return
   * returns plate
   */
  public String getLicensePlate() {
    return licensePlate;
  }

  /**
   * Method that accelerates the car.
   * @param userIncrease
   * @return
   * returns speed
   */
  public int accelerate(final int userIncrease) throws Exception {
    // Checking to see if speed exceeds maximum then increasing the speed
    if (this.speed + userIncrease > this.maximumSpeed) {
      throw null;
    } else {
      this.speed = this.speed + userIncrease;
    }

    // Returning the new speed to the user
    return this.speed;
  }
  /**
   * Method that deccelerates the car.
   * @param userDecrease
   * @return
   * returns speed
   */
  public int deccelerate(final int userDecrease) throws Exception {
    // Checking to see if speed exceeds maximum then increasing the speed
    if (this.speed - userDecrease < 0) {
      throw null;
    } else {
      this.speed = this.speed - userDecrease;
    }

    // Returning the new speed to the user
    return this.speed;
  }
}
