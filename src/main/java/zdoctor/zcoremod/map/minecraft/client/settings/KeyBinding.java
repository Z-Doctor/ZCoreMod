package zdoctor.zcoremod.map.minecraft.client.settings;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class KeyBinding {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhy";
		else
			return "net/minecraft/client/settings/KeyBinding";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bhy";
		else
			return "KeyBinding";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbhy;";
		else
			return "Lnet/minecraft/client/settings/KeyBinding;";
	}

	/**
	 * <p>
	 * Name: updateKeyBindState
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_186704_a = McMappingDatabase.getSRG("KeyBinding.func_186704_a");

	/**
	 * <p>
	 * Name: pressTime
	 * </p>
	 */
	public static McObfPair field_151474_i = McMappingDatabase.getSRG("field_151474_i");

	/**
	 * <p>
	 * Name: KEYBIND_SET
	 * </p>
	 */
	public static McObfPair field_151473_c = McMappingDatabase.getSRG("field_151473_c");

	/**
	 * <p>
	 * Name: CATEGORY_ORDER
	 * </p>
	 */
	public static McObfPair field_193627_d = McMappingDatabase.getSRG("field_193627_d");

	/**
	 * <p>
	 * Name: getKeyCategory
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_151466_e = McMappingDatabase.getSRG("KeyBinding.func_151466_e");

	/**
	 * <p>
	 * Name: pressed
	 * </p>
	 */
	public static McObfPair field_74513_e = McMappingDatabase.getSRG("field_74513_e");

	/**
	 * <p>
	 * Name: keyCodeDefault
	 * </p>
	 */
	public static McObfPair field_151472_e = McMappingDatabase.getSRG("field_151472_e");

	/**
	 * <p>
	 * Name: KEYBIND_ARRAY
	 * </p>
	 */
	public static McObfPair field_74516_a = McMappingDatabase.getSRG("field_74516_a");

	/**
	 * <p>
	 * Name: unPressAllKeys
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_74506_a = McMappingDatabase.getSRG("KeyBinding.func_74506_a");

	/**
	 * <p>
	 * Name: isKeyDown
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_151470_d = McMappingDatabase.getSRG("KeyBinding.func_151470_d");

	/**
	 * <p>
	 * Name: resetKeyBindingArrayAndHash
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_74508_b = McMappingDatabase.getSRG("KeyBinding.func_74508_b");

	/**
	 * <p>
	 * Name: onTick
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_74507_a = McMappingDatabase.getSRG("KeyBinding.func_74507_a");

	/**
	 * <p>
	 * Name: keyDescription
	 * </p>
	 */
	public static McObfPair field_74515_c = McMappingDatabase.getSRG("field_74515_c");

	/**
	 * <p>
	 * Name: getKeyCodeDefault
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_151469_h = McMappingDatabase.getSRG("KeyBinding.func_151469_h");

	/**
	 * <p>
	 * Name: keyCategory
	 * </p>
	 */
	public static McObfPair field_151471_f = McMappingDatabase.getSRG("field_151471_f");

	/**
	 * <p>
	 * Name: isPressed
	 * </p>
	 * <p>
	 * Desc: [()Z]
	 * </p>
	 */
	public static McObfPair func_151468_f = McMappingDatabase.getSRG("KeyBinding.func_151468_f");

	/**
	 * <p>
	 * Name: keyCode
	 * </p>
	 */
	public static McObfPair field_74512_d = McMappingDatabase.getSRG("field_74512_d");

	/**
	 * <p>
	 * Name: unpressKey
	 * </p>
	 * <p>
	 * Desc: [()V]
	 * </p>
	 */
	public static McObfPair func_74505_d = McMappingDatabase.getSRG("KeyBinding.func_74505_d");

	/**
	 * <p>
	 * Name: getDisplayString
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Ljava/util/function/Supplier;]
	 * </p>
	 */
	public static McObfPair func_193626_b = McMappingDatabase.getSRG("KeyBinding.func_193626_b");

	/**
	 * <p>
	 * Name: setKeyCode
	 * </p>
	 * <p>
	 * Desc: [(I)V]
	 * </p>
	 */
	public static McObfPair func_151462_b = McMappingDatabase.getSRG("KeyBinding.func_151462_b");

	/**
	 * <p>
	 * Name: getKeybinds
	 * </p>
	 * <p>
	 * Desc: [()Ljava/util/Set;]
	 * </p>
	 */
	public static McObfPair func_151467_c = McMappingDatabase.getSRG("KeyBinding.func_151467_c");

	/**
	 * <p>
	 * Name: setKeyBindState
	 * </p>
	 * <p>
	 * Desc: [(IZ)V]
	 * </p>
	 */
	public static McObfPair func_74510_a = McMappingDatabase.getSRG("KeyBinding.func_74510_a");

	/**
	 * <p>
	 * Name: getKeyDescription
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_151464_g = McMappingDatabase.getSRG("KeyBinding.func_151464_g");

	/**
	 * <p>
	 * Name: HASH
	 * </p>
	 */
	public static McObfPair field_74514_b = McMappingDatabase.getSRG("field_74514_b");

	/**
	 * <p>
	 * Name: getKeyCode
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_151463_i = McMappingDatabase.getSRG("KeyBinding.func_151463_i");

}
