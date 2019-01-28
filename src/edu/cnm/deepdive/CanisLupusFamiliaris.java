package edu.cnm.deepdive;

public class CanisLupusFamiliaris extends CanisLupus {

	@Override
	public void vocalize() {
		System.out.println("Bark!");
	}

	/* (non-Javadoc)
	 * @see edu.cnm.deepdive.CanisLupus#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "I am a good boy. And my name is fido ";
	}

	
}
