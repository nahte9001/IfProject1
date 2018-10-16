package controller;

//Import Section
import model.Cat;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Controller
{
	/**
	 * Builds the instance of the controller.
	 */

	public Controller()
	{
		
	}

	public void start()
	{
		loopy();
	}

	private void loopy()
	{
		// Define variable before loop
		boolean isDone = false;
		int count = 0;

		while (!isDone)// Test the variable
		{
			JOptionPane.showInputDialog(null, "when will the laamps be ready brother");
			// Eventually change the variable
			count++;
			if (count > 0)
			{
				isDone= true;
			}

		}
		for (int loop = 30; loop >= 0; loop -= 5)
		{
			JOptionPane.showInputDialog(null, "This is the " + loop + "th thine Run object I made");
		}
	}
	
	private void catBasket()
	{
		//Local variables are only visible in the method they are defined in!
		//they only have SCOPE to that method
		
		ArrayList<Cat> myCats = new ArrayList<Cat>();
		//Array lists require < > gang signs.
		ArrayList<Integer> myNums = new ArrayList<Integer>();
		//Have to use a Wrapper class to hold a primitive in a list
				
		
		Cat sampleCat = new Cat();
		Cat otherCat = new Cat();
		
		myCats.add(sampleCat);
		myCats.add(sampleCat);
		myCats.add(otherCat);
		
		//Standard forward loop
		//if used to remove you have to change index -=1
		for (int index = 0; index < myCats.size(); index += 1)
		{
			//Good for display, or minor changes
			JOptionPane.showMessageDialog(null,  myCats.get(index).getName());
			
			//Good for remove, replace, change multiple values
			Cat currentCat = myCats.get(index);
			currentCat.setName("The new name is " + index + " run");
			currentCat.setLength(index * (int) (Math.random() * 300));
		}
		
		//Standard backward loop
		//great for removing!!!
		for (int index = myCats.size() - 1; index >= 0; index -= 1)
		
		{
			Cat currentCat = myCats.get(index);
			currentCat.setLength(index * currentCat.getLength());
		}
		
		for (Cat current : myCats)
		{
			JOptionPane.showMessageDialog(null, "The Cat is named: " + current.getName());
		}
		
	}

	private void askUser()
	{
		Cat userCat = new Cat();

		// ask
		String response = JOptionPane.showInputDialog(null, "What is the cat's length???");

		// repeat until finished correctly
		while (response == null || !validDouble(response) || response.equals(""))
		{
			response = JOptionPane.showInputDialog(null, "No! type in a valid number for cat length!");
		}
		// assign and convert
		userCat.setLength(Integer.parseInt(response));

		response = JOptionPane.showInputDialog(null, "What is Cat even");
		if (response == null || response.equalsIgnoreCase("Shut up 7 up"))
		{
			JOptionPane.showMessageDialog(null, "You either pressed cancel, the x, or typedd nothing. Get your life together.");
		}
		JOptionPane.showMessageDialog(null, userCat);
	}


	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;

		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You should type and integer value or somethin");
		}

		return isValid;
	}

	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;

		try
		{
			Double.parseDouble(maybeDouble);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "This requires a double value aka something with a . >)");
		}

		return isValid;

	}
}
