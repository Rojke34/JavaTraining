public class Student{
	private String name;

	private double firstQulification;
	private double secondQulification;
	private double thirdQualification;

	private final static double FIRST_SECOND_PERCENTAGE = 0.3;
	private final static double THIRD_PERCENTAGE 		= 0.4;	

	public String getName( ){ return name; }
	public void setName( String name ){
		this.name = name;
	}

	public double getScoreOne( ) { return firstQulification; }
	public void setScoreOne( double value ){
		this.firstQulification = value;
	}

	public double getScoreTwo( ){ return secondQulification; }
	public void setScoreTwo( double value ){
		this.secondQulification = value;
	}

	public double getScoreThree( ){ return thirdQualification; }
	public void setScoreThree( double value ){
		this.thirdQualification = value; 
	}

	public double getAverage( ){
		double average =  ( firstQulification * FIRST_SECOND_PERCENTAGE ) + ( secondQulification * FIRST_SECOND_PERCENTAGE ) + ( thirdQualification * THIRD_PERCENTAGE );
		return average; 
	}

}