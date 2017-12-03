package org.aesy.fractal.fractal;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Represents an escape time fractal. These fractals are generated by iterating a formula on
 * each point in a given space (such as the complex plane). If a point diverges as the formula
 * is iterated, it escapes; otherwise, it remains bounded.
 */
public interface EscapeTimeFractal {
    /**
     * Samples a point in space to determine the amount of iterations until the point diverges.
     *
     * @param x
     * @param y
     * @return The amount of iterations until divergence.
     */
    BigInteger sample(BigDecimal x, BigDecimal y);

    /**
     * Samples a point to determine whether the point remains bounded.
     *
     * @param x
     * @param y
     * @return An indication whether the point remains bounded.
     */
    boolean isBound(BigDecimal x, BigDecimal y);
}