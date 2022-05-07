/*2
Write an interface called Playable, with a method void play(); Let this interface be placed in a 
package called music.
Write a class called Veena which implements Playable interface. Let this class be placed in a 
package music.string
Write a class called Saxophone which implements Playable interface. Let this class be placed in 
a package music.wind
Write another class Test in a package called live. Then, a. Create an instance of Veena and call 
play() method b. Create an instance of Saxophone and call play() method c. Place the above 
instances in a variable of type Playable and then call play()*/

//if you have any alternate method comment down below.



import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;

public class Test {

	public static void main(String[] args) {

		Veena v = new Veena();
		v.play();
		
		Playable p = new Veena();
		p.play();
		
		Saxophone s = new Saxophone();
		s.play();
		
		Playable ps = new Saxophone();
		ps.play();

	}

}

package music;

public interface Playable {

	void play();

}


package music.string;

import music.Playable;

public class Veena implements Playable {

	public void play() {

		System.out.println("Veena is Playing");

	}

}

package music.wind;

import music.Playable;

public class Saxophone implements Playable {

	public void play() {

		System.out.println("Saxophone is Playing");

	}

}