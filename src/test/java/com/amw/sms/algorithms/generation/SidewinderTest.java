package com.amw.sms.algorithms.generation;

/**
 * Tests for Sidewinder.
 */
public class SidewinderTest extends MazeGenAlgorithmTest {
    
    /**
     * {@inheritDoc}
     */
    @Override
    MazeGenAlgorithm getGenAlgorithmUnderTest() {
        return new Sidewinder();
    }
}