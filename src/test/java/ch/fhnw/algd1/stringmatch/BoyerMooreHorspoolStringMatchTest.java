package ch.fhnw.algd1.stringmatch;

import ch.fhnw.algd1.stringmatch.framework.IStringMatch;

public class BoyerMooreHorspoolStringMatchTest extends AbstractStringMatchTest {

	@Override
	protected IStringMatch getMatcher() {
		return new BoyerMooreHorspoolStringMatch();
	}

}
