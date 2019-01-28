package edu.cnm.deepdive;

public class CanisLupus extends Canis {

	/* (non-Javadoc)
	 * @see edu.cnm.deepdive.Canis#toString()
	 */
	@Override
	public String toString() {
			return super.toString();
	}

	@Override
	public void vocalize() {
		System.out.println("Howl!");
	}

	@Override
	public void hunt() {
		System.out.println("Hunt prey in packs");

	}

}
