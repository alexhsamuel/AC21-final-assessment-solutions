package radiobutton;

/**
 * Represents a group of "radio buttons": toggle buttons for which exactly one is selected
 * at a given time. If a different button is selected, the previously-selected button is
 * automatically unselected.
 *
 * Buttons are numbered from 0 to one less than the number of buttons. For example, if the
 * button group has 4 buttons, they are numbered 0, 1, 2, and 3.
 */
public class RadioButtonGroup {

    /**
     * Creates a group of radio buttons.
     *
     * @param numButtons
     *   The number of buttons in the group.
     * @param initial
     *   The button number that is initially selected.
     * @raise RuntimeException
     *   The initial button number is invalid.
     */
    public RadioButtonGroup(int numButtons, int initial) {
        this.numButtons = numButtons;
        select(initial);
    }

    /**
     * Creates a group of radio buttons. Button 0 is initially selected.
     */
    public RadioButtonGroup(int numButtons) {
        this(numButtons, 0);
    }

    /**
     * Selects a button, unselecting the button that was previously selected.
     * @param button
     *   The button number to select.
     * @raise RuntimeException
     *   The button number is invalid.
     */
    public void select(int button) {
        checkButtonNumber(button);
        selectedButton = button;
    }

    /**
     * Returns whether a given button is selected.
     * @param button
     *   The button number to check.
     * @raise RuntimeException
     *   The button number is invalid.
     */
    public boolean isSelected(int button) {
        checkButtonNumber(button);
        return button == selectedButton;
    }

    /**
     * Helper function that throws 'RuntimeException' if 'buttonNumber' is invalid.
     */
    private void checkButtonNumber(int buttonNumber) {
        if (buttonNumber < 0 || buttonNumber >= numButtons)
            throw new RuntimeException("invalid button number");
    }

    private final int numButtons;
    private int selectedButton;

}
