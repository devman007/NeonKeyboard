
package keyboard.neon.newboard.ime.keyboard

/**
 * Abstract class describing a computed keyboard. The exact implementation is dependent on the subclass and the
 * structure can vary quite much between different subclasses.
 */
abstract class Keyboard {
    /**
     * Returns the key for given [pointerX] and [pointerY] coords or null if no key touch hit box is defined at the
     * given coords.
     *
     * @param pointerX The x-coordinate of the input event, absolute within the parent keyboard view.
     * @param pointerY The y-coordinate of the input event, absolute within the parent keyboard view.
     *
     * @return The key for given coords or null if no key touch hit box is defined for this position.
     */
    abstract fun getKeyForPos(pointerX: Int, pointerY: Int): Key?

    /**
     * Returns an iterator which allows to loop through all keys within the layout, independent of the actual
     * structure and layout.
     */
    abstract fun keys(): Iterator<Key>

    /**
     * Layouts the keys according the the dimensions and parameters provided by given [keyboardView]. This method's
     * exact behavior is highly dependent aon the actual subclass.
     *
     * @param keyboardView The parent keyboard view which is used to gather the absolute dimensions and other
     *  subclass specific parameters.
     */
    abstract fun layout(keyboardView: KeyboardView)
}
