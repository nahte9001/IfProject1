package model;

public class Cat
{
	// declaration section
	// Data member section
	// Also called instance variables
	// These are special - they get a "default" value
	// All numbers => 0
	// boolean => false
	// Objects =>null!!!

	private String Name;
	private int LegCount;
	private int Length;

	/**
	 * Default constructor for after the fact of customization. AKA I don't know the
	 * info about the run Initializing data members with "bad values to be changed.
	 */

	public String getName()
	{
		return Name;

	}

	public int getLegCount()
	{
		return LegCount;
	}

	public int getLength()
	{
		return Length;
	}

	public void setName(String Name)
	{
		this.Name = Name;
	}

	public void setLength(int Length)
	{
		this.Length = Length;
	}

	public void setLegCount(int LegCount)
	{
		this.LegCount = LegCount;
	}

}
