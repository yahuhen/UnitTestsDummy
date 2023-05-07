package classwork.day16;

import org.junit.Test;

public class JUnitTest {

    FirstStep firstStep = new FirstStep();

    @Test
    public void MyDemoScenarion1(){
        firstStep.iOpenFirstSite();
        firstStep.iFillAsNameOfFirstSite("Minsk");
        firstStep.iNeedToSeeSite();
    }
    @Test
    public void MyDemoScenarion2(){
        firstStep.iOpenFirstSite();
        firstStep.iFillAsNameOfFirstSite("Minsk2");
        firstStep.iNeedToSeeSite();
    }
    @Test
    public void MyDemoScenarion3(){
        firstStep.iOpenFirstSite();
        firstStep.iFillAsNameOfFirstSite("Minsk3");
        firstStep.iNeedToSeeSite();
    }
}
