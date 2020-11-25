package model.edu.cofc.cs656.models;

public class RenterReview
{
	private static int index = 1000;
	private int reviewID;
	private int renterID;
	private int rentalID;
	private int rating;
	private String comments;

	public RenterReview(int renterId, int rentalId, int reviewRating, String reviewComments)
	{
		reviewID = index;
		renterID = renterId;
		rentalID = rentalId;
		rating = reviewRating;
		comments = reviewComments;
		index++;
	}
	
	public int GetRenterID(){return renterID;}
	public void SetRenterID(int id){renterID = id;}	
	
	public int GetRentalID(){return rentalID;}
	public void SetRentalID(int id){rentalID = id;}

	public int GetRating(){return rating;}
	public void SetRating(int score){rating = score;}	
	
	public String GetComments(){return comments;}
	public void SetComments(String com){comments = com;}
	
	public String toString()
	{
		return "[reviewID = " + String.valueOf(reviewID) + "; renterID = " + String.valueOf(renterID) + "; rentalID = " + String.valueOf(rentalID) + "; rating = " + String.valueOf(rating) + "; comments = " + comments + "]";
	}
}