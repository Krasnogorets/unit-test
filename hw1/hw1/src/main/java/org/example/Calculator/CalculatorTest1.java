package org.example.Calculator;

import org.assertj.core.api.Assertions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CalculatorTest1 {


    public static void main(String[] args) {
//        Calculator.calculation (5,0,'/');
//        System.out.println(Calculator.calculatingDiscount(40.5, 2));
//        Calculator.calculatingDiscount(40.5, 60);
//        Calculator.calculatingDiscount(-40.5, -60);
        System.out.println("test1");
        assertThatThrownBy(() -> Calculator.calculation(5, 0, '/')
         ).isInstanceOf(ArithmeticException.class).hasMessageContaining("not");
        System.out.println("test2");
        assertThat(Calculator.calculatingDiscount(40.5, 2)).isEqualTo(38.5);
        System.out.println("test3");
        assertThatThrownBy(() -> Calculator.calculatingDiscount(40.5, 60))
                .isInstanceOf(ArithmeticException.class).hasMessageContaining("не");
        System.out.println("test4");
        assertThatThrownBy(() -> Calculator.calculatingDiscount(-40.5, -60))
                .isInstanceOf(ArithmeticException.class).hasMessageContaining("не");
    }
}
