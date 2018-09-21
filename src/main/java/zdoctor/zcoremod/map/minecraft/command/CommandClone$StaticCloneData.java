package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CommandClone$StaticCloneData {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bx$a";
		else
			return "net/minecraft/command/CommandClone$StaticCloneData";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bx$a";
		else
			return "CommandClone$StaticCloneData";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbx$a;";
		else
			return "Lnet/minecraft/command/CommandClone$StaticCloneData;";
	}

	/**
	 * <p>
	 * Name: nbt
	 * </p>
	 */
	public static McObfPair field_184953_c = McMappingDatabase.getSRG("field_184953_c");

	/**
	 * <p>
	 * Name: blockState
	 * </p>
	 */
	public static McObfPair field_179535_b = McMappingDatabase.getSRG("field_179535_b");

	/**
	 * <p>
	 * Name: pos
	 * </p>
	 */
	public static McObfPair field_179537_a = McMappingDatabase.getSRG("field_179537_a");

}
