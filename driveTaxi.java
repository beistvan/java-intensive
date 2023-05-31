public static void driveTaxi(Taxi driver, int toX, int toY) {

    while (driver.getX() != toX) {
        if (driver.getX() < toX) {
            driver.moveRight();
        } else if (driver.getX() > toX) {
            driver.moveLeft();
        }
    }

    while (driver.getY() != toY) {
        if (driver.getY() < toY) {
            driver.moveUp();
        } else if (driver.getY() > toY) {
            driver.moveDown();
        }
    }

}