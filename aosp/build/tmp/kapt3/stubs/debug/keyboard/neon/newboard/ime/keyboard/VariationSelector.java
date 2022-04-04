package keyboard.neon.newboard.ime.keyboard;

import java.lang.System;

/**
 * Allows to select an [AbstractKeyData] based on the current variation. Note that this type of selector only really
 * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
 * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `variation_selector`.
 *
 * Example usage in a layout JSON file:
 * ```
 * { "$": "variation_selector",
 *  "default":  { "code":   44, "label": "," },
 *  "email":    { "code":   64, "label": "@" },
 *  "uri":      { "code":   47, "label": "/" }
 * }
 * ```
 *
 * @property default The default key data which should be used in case no key variation is known or for the current
 * key variation no override key is defined. Can be null, in this case this may mean the variation selector hides
 * the key if no direct match is present.
 * @property email The key data to use if [KeyVariation.EMAIL_ADDRESS] is the active key variation. If this value is
 * null, [default] will be used instead.
 * @property uri The key data to use if [KeyVariation.URI] is the active key variation. If this value is null,
 * [default] will be used instead.
 * @property normal The key data to use if [KeyVariation.NORMAL] is the active key variation. If this value is null,
 * [default] will be used instead.
 * @property password The key data to use if [KeyVariation.PASSWORD] is the active key variation. If this value is
 * null, [default] will be used instead.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002-.BK\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bBA\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016JE\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001H\u00c6\u0001J\u0013\u0010!\u001a\u00020\u00162\b\u0010\"\u001a\u0004\u0018\u00010#H\u00d6\u0003J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001J\t\u0010%\u001a\u00020\u0014H\u00d6\u0001J!\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u00c7\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006/"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/VariationSelector;", "Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;", "seen1", "", "default", "email", "uri", "normal", "password", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;)V", "getDefault", "()Lkeyboard/neon/newboard/ime/keyboard/AbstractKeyData;", "getEmail", "getNormal", "getPassword", "getUri", "asString", "", "isForDisplay", "", "component1", "component2", "component3", "component4", "component5", "compute", "Lkeyboard/neon/newboard/ime/keyboard/KeyData;", "evaluator", "Lkeyboard/neon/newboard/ime/keyboard/ComputingEvaluator;", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "aosp_debug"})
@kotlinx.serialization.SerialName(value = "variation_selector")
@kotlinx.serialization.Serializable()
public final class VariationSelector implements keyboard.neon.newboard.ime.keyboard.AbstractKeyData {
    
    /**
     * Allows to select an [AbstractKeyData] based on the current variation. Note that this type of selector only really
     * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
     * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `variation_selector`.
     *
     * Example usage in a layout JSON file:
     * ```
     * { "$": "variation_selector",
     *  "default":  { "code":   44, "label": "," },
     *  "email":    { "code":   64, "label": "@" },
     *  "uri":      { "code":   47, "label": "/" }
     * }
     * ```
     *
     * @property default The default key data which should be used in case no key variation is known or for the current
     * key variation no override key is defined. Can be null, in this case this may mean the variation selector hides
     * the key if no direct match is present.
     * @property email The key data to use if [KeyVariation.EMAIL_ADDRESS] is the active key variation. If this value is
     * null, [default] will be used instead.
     * @property uri The key data to use if [KeyVariation.URI] is the active key variation. If this value is null,
     * [default] will be used instead.
     * @property normal The key data to use if [KeyVariation.NORMAL] is the active key variation. If this value is null,
     * [default] will be used instead.
     * @property password The key data to use if [KeyVariation.PASSWORD] is the active key variation. If this value is
     * null, [default] will be used instead.
     */
    @org.jetbrains.annotations.NotNull()
    public static final keyboard.neon.newboard.ime.keyboard.VariationSelector.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private final keyboard.neon.newboard.ime.keyboard.AbstractKeyData email = null;
    @org.jetbrains.annotations.Nullable()
    private final keyboard.neon.newboard.ime.keyboard.AbstractKeyData uri = null;
    @org.jetbrains.annotations.Nullable()
    private final keyboard.neon.newboard.ime.keyboard.AbstractKeyData normal = null;
    @org.jetbrains.annotations.Nullable()
    private final keyboard.neon.newboard.ime.keyboard.AbstractKeyData password = null;
    
    /**
     * Allows to select an [AbstractKeyData] based on the current variation. Note that this type of selector only really
     * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
     * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `variation_selector`.
     *
     * Example usage in a layout JSON file:
     * ```
     * { "$": "variation_selector",
     *  "default":  { "code":   44, "label": "," },
     *  "email":    { "code":   64, "label": "@" },
     *  "uri":      { "code":   47, "label": "/" }
     * }
     * ```
     *
     * @property default The default key data which should be used in case no key variation is known or for the current
     * key variation no override key is defined. Can be null, in this case this may mean the variation selector hides
     * the key if no direct match is present.
     * @property email The key data to use if [KeyVariation.EMAIL_ADDRESS] is the active key variation. If this value is
     * null, [default] will be used instead.
     * @property uri The key data to use if [KeyVariation.URI] is the active key variation. If this value is null,
     * [default] will be used instead.
     * @property normal The key data to use if [KeyVariation.NORMAL] is the active key variation. If this value is null,
     * [default] will be used instead.
     * @property password The key data to use if [KeyVariation.PASSWORD] is the active key variation. If this value is
     * null, [default] will be used instead.
     */
    @org.jetbrains.annotations.NotNull()
    public final keyboard.neon.newboard.ime.keyboard.VariationSelector copy(@org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.keyboard.AbstractKeyData p0_772401952, @org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.keyboard.AbstractKeyData email, @org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.keyboard.AbstractKeyData uri, @org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.keyboard.AbstractKeyData normal, @org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.keyboard.AbstractKeyData password) {
        return null;
    }
    
    /**
     * Allows to select an [AbstractKeyData] based on the current variation. Note that this type of selector only really
     * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
     * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `variation_selector`.
     *
     * Example usage in a layout JSON file:
     * ```
     * { "$": "variation_selector",
     *  "default":  { "code":   44, "label": "," },
     *  "email":    { "code":   64, "label": "@" },
     *  "uri":      { "code":   47, "label": "/" }
     * }
     * ```
     *
     * @property default The default key data which should be used in case no key variation is known or for the current
     * key variation no override key is defined. Can be null, in this case this may mean the variation selector hides
     * the key if no direct match is present.
     * @property email The key data to use if [KeyVariation.EMAIL_ADDRESS] is the active key variation. If this value is
     * null, [default] will be used instead.
     * @property uri The key data to use if [KeyVariation.URI] is the active key variation. If this value is null,
     * [default] will be used instead.
     * @property normal The key data to use if [KeyVariation.NORMAL] is the active key variation. If this value is null,
     * [default] will be used instead.
     * @property password The key data to use if [KeyVariation.PASSWORD] is the active key variation. If this value is
     * null, [default] will be used instead.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Allows to select an [AbstractKeyData] based on the current variation. Note that this type of selector only really
     * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
     * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `variation_selector`.
     *
     * Example usage in a layout JSON file:
     * ```
     * { "$": "variation_selector",
     *  "default":  { "code":   44, "label": "," },
     *  "email":    { "code":   64, "label": "@" },
     *  "uri":      { "code":   47, "label": "/" }
     * }
     * ```
     *
     * @property default The default key data which should be used in case no key variation is known or for the current
     * key variation no override key is defined. Can be null, in this case this may mean the variation selector hides
     * the key if no direct match is present.
     * @property email The key data to use if [KeyVariation.EMAIL_ADDRESS] is the active key variation. If this value is
     * null, [default] will be used instead.
     * @property uri The key data to use if [KeyVariation.URI] is the active key variation. If this value is null,
     * [default] will be used instead.
     * @property normal The key data to use if [KeyVariation.NORMAL] is the active key variation. If this value is null,
     * [default] will be used instead.
     * @property password The key data to use if [KeyVariation.PASSWORD] is the active key variation. If this value is
     * null, [default] will be used instead.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Allows to select an [AbstractKeyData] based on the current variation. Note that this type of selector only really
     * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
     * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `variation_selector`.
     *
     * Example usage in a layout JSON file:
     * ```
     * { "$": "variation_selector",
     *  "default":  { "code":   44, "label": "," },
     *  "email":    { "code":   64, "label": "@" },
     *  "uri":      { "code":   47, "label": "/" }
     * }
     * ```
     *
     * @property default The default key data which should be used in case no key variation is known or for the current
     * key variation no override key is defined. Can be null, in this case this may mean the variation selector hides
     * the key if no direct match is present.
     * @property email The key data to use if [KeyVariation.EMAIL_ADDRESS] is the active key variation. If this value is
     * null, [default] will be used instead.
     * @property uri The key data to use if [KeyVariation.URI] is the active key variation. If this value is null,
     * [default] will be used instead.
     * @property normal The key data to use if [KeyVariation.NORMAL] is the active key variation. If this value is null,
     * [default] will be used instead.
     * @property password The key data to use if [KeyVariation.PASSWORD] is the active key variation. If this value is
     * null, [default] will be used instead.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Allows to select an [AbstractKeyData] based on the current variation. Note that this type of selector only really
     * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
     * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `variation_selector`.
     *
     * Example usage in a layout JSON file:
     * ```
     * { "$": "variation_selector",
     *  "default":  { "code":   44, "label": "," },
     *  "email":    { "code":   64, "label": "@" },
     *  "uri":      { "code":   47, "label": "/" }
     * }
     * ```
     *
     * @property default The default key data which should be used in case no key variation is known or for the current
     * key variation no override key is defined. Can be null, in this case this may mean the variation selector hides
     * the key if no direct match is present.
     * @property email The key data to use if [KeyVariation.EMAIL_ADDRESS] is the active key variation. If this value is
     * null, [default] will be used instead.
     * @property uri The key data to use if [KeyVariation.URI] is the active key variation. If this value is null,
     * [default] will be used instead.
     * @property normal The key data to use if [KeyVariation.NORMAL] is the active key variation. If this value is null,
     * [default] will be used instead.
     * @property password The key data to use if [KeyVariation.PASSWORD] is the active key variation. If this value is
     * null, [default] will be used instead.
     */
    @kotlin.jvm.JvmStatic()
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.VariationSelector self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public VariationSelector() {
        super();
    }
    
    public VariationSelector(@org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.keyboard.AbstractKeyData p0_772401952, @org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.keyboard.AbstractKeyData email, @org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.keyboard.AbstractKeyData uri, @org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.keyboard.AbstractKeyData normal, @org.jetbrains.annotations.Nullable()
    keyboard.neon.newboard.ime.keyboard.AbstractKeyData password) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.keyboard.AbstractKeyData component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.keyboard.AbstractKeyData getDefault() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.keyboard.AbstractKeyData component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.keyboard.AbstractKeyData getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.keyboard.AbstractKeyData component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.keyboard.AbstractKeyData getUri() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.keyboard.AbstractKeyData component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.keyboard.AbstractKeyData getNormal() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.keyboard.AbstractKeyData component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final keyboard.neon.newboard.ime.keyboard.AbstractKeyData getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public keyboard.neon.newboard.ime.keyboard.KeyData compute(@org.jetbrains.annotations.NotNull()
    keyboard.neon.newboard.ime.keyboard.ComputingEvaluator evaluator) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String asString(boolean isForDisplay) {
        return null;
    }
    
    /**
     * Allows to select an [AbstractKeyData] based on the current variation. Note that this type of selector only really
     * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
     * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `variation_selector`.
     *
     * Example usage in a layout JSON file:
     * ```
     * { "$": "variation_selector",
     *  "default":  { "code":   44, "label": "," },
     *  "email":    { "code":   64, "label": "@" },
     *  "uri":      { "code":   47, "label": "/" }
     * }
     * ```
     *
     * @property default The default key data which should be used in case no key variation is known or for the current
     * key variation no override key is defined. Can be null, in this case this may mean the variation selector hides
     * the key if no direct match is present.
     * @property email The key data to use if [KeyVariation.EMAIL_ADDRESS] is the active key variation. If this value is
     * null, [default] will be used instead.
     * @property uri The key data to use if [KeyVariation.URI] is the active key variation. If this value is null,
     * [default] will be used instead.
     * @property normal The key data to use if [KeyVariation.NORMAL] is the active key variation. If this value is null,
     * [default] will be used instead.
     * @property password The key data to use if [KeyVariation.PASSWORD] is the active key variation. If this value is
     * null, [default] will be used instead.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lkeyboard/neon/newboard/ime/keyboard/VariationSelector$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lkeyboard/neon/newboard/ime/keyboard/VariationSelector;", "aosp_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Allows to select an [AbstractKeyData] based on the current variation. Note that this type of selector only really
         * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
         * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `variation_selector`.
         *
         * Example usage in a layout JSON file:
         * ```
         * { "$": "variation_selector",
         *  "default":  { "code":   44, "label": "," },
         *  "email":    { "code":   64, "label": "@" },
         *  "uri":      { "code":   47, "label": "/" }
         * }
         * ```
         *
         * @property default The default key data which should be used in case no key variation is known or for the current
         * key variation no override key is defined. Can be null, in this case this may mean the variation selector hides
         * the key if no direct match is present.
         * @property email The key data to use if [KeyVariation.EMAIL_ADDRESS] is the active key variation. If this value is
         * null, [default] will be used instead.
         * @property uri The key data to use if [KeyVariation.URI] is the active key variation. If this value is null,
         * [default] will be used instead.
         * @property normal The key data to use if [KeyVariation.NORMAL] is the active key variation. If this value is null,
         * [default] will be used instead.
         * @property password The key data to use if [KeyVariation.PASSWORD] is the active key variation. If this value is
         * null, [default] will be used instead.
         */
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<keyboard.neon.newboard.ime.keyboard.VariationSelector> serializer() {
            return null;
        }
    }
    
    /**
     * Allows to select an [AbstractKeyData] based on the current variation. Note that this type of selector only really
     * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
     * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `variation_selector`.
     *
     * Example usage in a layout JSON file:
     * ```
     * { "$": "variation_selector",
     *  "default":  { "code":   44, "label": "," },
     *  "email":    { "code":   64, "label": "@" },
     *  "uri":      { "code":   47, "label": "/" }
     * }
     * ```
     *
     * @property default The default key data which should be used in case no key variation is known or for the current
     * key variation no override key is defined. Can be null, in this case this may mean the variation selector hides
     * the key if no direct match is present.
     * @property email The key data to use if [KeyVariation.EMAIL_ADDRESS] is the active key variation. If this value is
     * null, [default] will be used instead.
     * @property uri The key data to use if [KeyVariation.URI] is the active key variation. If this value is null,
     * [default] will be used instead.
     * @property normal The key data to use if [KeyVariation.NORMAL] is the active key variation. If this value is null,
     * [default] will be used instead.
     * @property password The key data to use if [KeyVariation.PASSWORD] is the active key variation. If this value is
     * null, [default] will be used instead.
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"keyboard/neon/newboard/ime/keyboard/VariationSelector.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lkeyboard/neon/newboard/ime/keyboard/VariationSelector;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "aosp_debug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<keyboard.neon.newboard.ime.keyboard.VariationSelector> {
        
        /**
         * Allows to select an [AbstractKeyData] based on the current variation. Note that this type of selector only really
         * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
         * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `variation_selector`.
         *
         * Example usage in a layout JSON file:
         * ```
         * { "$": "variation_selector",
         *  "default":  { "code":   44, "label": "," },
         *  "email":    { "code":   64, "label": "@" },
         *  "uri":      { "code":   47, "label": "/" }
         * }
         * ```
         *
         * @property default The default key data which should be used in case no key variation is known or for the current
         * key variation no override key is defined. Can be null, in this case this may mean the variation selector hides
         * the key if no direct match is present.
         * @property email The key data to use if [KeyVariation.EMAIL_ADDRESS] is the active key variation. If this value is
         * null, [default] will be used instead.
         * @property uri The key data to use if [KeyVariation.URI] is the active key variation. If this value is null,
         * [default] will be used instead.
         * @property normal The key data to use if [KeyVariation.NORMAL] is the active key variation. If this value is null,
         * [default] will be used instead.
         * @property password The key data to use if [KeyVariation.PASSWORD] is the active key variation. If this value is
         * null, [default] will be used instead.
         */
        @org.jetbrains.annotations.NotNull()
        public static final keyboard.neon.newboard.ime.keyboard.VariationSelector.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        /**
         * Allows to select an [AbstractKeyData] based on the current variation. Note that this type of selector only really
         * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
         * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `variation_selector`.
         *
         * Example usage in a layout JSON file:
         * ```
         * { "$": "variation_selector",
         *  "default":  { "code":   44, "label": "," },
         *  "email":    { "code":   64, "label": "@" },
         *  "uri":      { "code":   47, "label": "/" }
         * }
         * ```
         *
         * @property default The default key data which should be used in case no key variation is known or for the current
         * key variation no override key is defined. Can be null, in this case this may mean the variation selector hides
         * the key if no direct match is present.
         * @property email The key data to use if [KeyVariation.EMAIL_ADDRESS] is the active key variation. If this value is
         * null, [default] will be used instead.
         * @property uri The key data to use if [KeyVariation.URI] is the active key variation. If this value is null,
         * [default] will be used instead.
         * @property normal The key data to use if [KeyVariation.NORMAL] is the active key variation. If this value is null,
         * [default] will be used instead.
         * @property password The key data to use if [KeyVariation.PASSWORD] is the active key variation. If this value is
         * null, [default] will be used instead.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        /**
         * Allows to select an [AbstractKeyData] based on the current variation. Note that this type of selector only really
         * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
         * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `variation_selector`.
         *
         * Example usage in a layout JSON file:
         * ```
         * { "$": "variation_selector",
         *  "default":  { "code":   44, "label": "," },
         *  "email":    { "code":   64, "label": "@" },
         *  "uri":      { "code":   47, "label": "/" }
         * }
         * ```
         *
         * @property default The default key data which should be used in case no key variation is known or for the current
         * key variation no override key is defined. Can be null, in this case this may mean the variation selector hides
         * the key if no direct match is present.
         * @property email The key data to use if [KeyVariation.EMAIL_ADDRESS] is the active key variation. If this value is
         * null, [default] will be used instead.
         * @property uri The key data to use if [KeyVariation.URI] is the active key variation. If this value is null,
         * [default] will be used instead.
         * @property normal The key data to use if [KeyVariation.NORMAL] is the active key variation. If this value is null,
         * [default] will be used instead.
         * @property password The key data to use if [KeyVariation.PASSWORD] is the active key variation. If this value is
         * null, [default] will be used instead.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public keyboard.neon.newboard.ime.keyboard.VariationSelector deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        /**
         * Allows to select an [AbstractKeyData] based on the current variation. Note that this type of selector only really
         * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
         * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `variation_selector`.
         *
         * Example usage in a layout JSON file:
         * ```
         * { "$": "variation_selector",
         *  "default":  { "code":   44, "label": "," },
         *  "email":    { "code":   64, "label": "@" },
         *  "uri":      { "code":   47, "label": "/" }
         * }
         * ```
         *
         * @property default The default key data which should be used in case no key variation is known or for the current
         * key variation no override key is defined. Can be null, in this case this may mean the variation selector hides
         * the key if no direct match is present.
         * @property email The key data to use if [KeyVariation.EMAIL_ADDRESS] is the active key variation. If this value is
         * null, [default] will be used instead.
         * @property uri The key data to use if [KeyVariation.URI] is the active key variation. If this value is null,
         * [default] will be used instead.
         * @property normal The key data to use if [KeyVariation.NORMAL] is the active key variation. If this value is null,
         * [default] will be used instead.
         * @property password The key data to use if [KeyVariation.PASSWORD] is the active key variation. If this value is
         * null, [default] will be used instead.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        /**
         * Allows to select an [AbstractKeyData] based on the current variation. Note that this type of selector only really
         * makes sense in a text context, though technically speaking it can be used anywhere, so this implementation allows
         * for any [AbstractKeyData] to be used here. The JSON class identifier for this selector is `variation_selector`.
         *
         * Example usage in a layout JSON file:
         * ```
         * { "$": "variation_selector",
         *  "default":  { "code":   44, "label": "," },
         *  "email":    { "code":   64, "label": "@" },
         *  "uri":      { "code":   47, "label": "/" }
         * }
         * ```
         *
         * @property default The default key data which should be used in case no key variation is known or for the current
         * key variation no override key is defined. Can be null, in this case this may mean the variation selector hides
         * the key if no direct match is present.
         * @property email The key data to use if [KeyVariation.EMAIL_ADDRESS] is the active key variation. If this value is
         * null, [default] will be used instead.
         * @property uri The key data to use if [KeyVariation.URI] is the active key variation. If this value is null,
         * [default] will be used instead.
         * @property normal The key data to use if [KeyVariation.NORMAL] is the active key variation. If this value is null,
         * [default] will be used instead.
         * @property password The key data to use if [KeyVariation.PASSWORD] is the active key variation. If this value is
         * null, [default] will be used instead.
         */
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        keyboard.neon.newboard.ime.keyboard.VariationSelector value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}