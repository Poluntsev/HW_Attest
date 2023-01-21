package Attestation;

import Attestation.Cars.*;
import Attestation.CarsClass.CarsClassFactory;
import Attestation.Generator.FirstSituation;
import Attestation.Generator.ISituationGenerator;
import Attestation.Generator.SecondSituation;

public class RoadSituation {
    public static void main(String[] args) {

        ISituationGenerator firstSituation = new FirstSituation();
        ISituationGenerator secondSituation = new SecondSituation();

        firstSituation.generate();

    }
}

