public class Rental {
	private int _daysLate;
	private Movie _movie;
	private int _idNumber;

	// setters
	public void setIdNumber(int idNumber) {
		if (idNumber < 0)
			throw new IllegalArgumentException("ID number must be greater than zero.");
		_idNumber = idNumber;
	}
	public void setMovie(Movie movie) {
		_movie = movie;
	}
	public void setDaysLate() {
		if (idNumber < 0)
			throw new IllegalArgumentException("Number of days late be greater than zero.");
		_daysLate = daysLate;
	}

	// getters
	public int idNumber() {
		return _idNumber;
	}
	public Movie movie() {
		return _movie;
	}
	public int daysLate() {
		return _daysLate;
	}
}