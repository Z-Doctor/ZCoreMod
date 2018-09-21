package zdoctor.zcoremod.map.minecraft.command;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class CommandResultStats$Type {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bp$a";
		else
			return "net/minecraft/command/CommandResultStats$Type";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bp$a";
		else
			return "CommandResultStats$Type";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbp$a;";
		else
			return "Lnet/minecraft/command/CommandResultStats$Type;";
	}

	/**
	 * <p>
	 * Name: getTypeNames
	 * </p>
	 * <p>
	 * Desc: [()[Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_179634_c = McMappingDatabase.getSRG("CommandResultStats$Type.func_179634_c");

	/**
	 * <p>
	 * Name: getTypeByName
	 * </p>
	 * <p>
	 * Desc: [(Ljava/lang/String;)Lnet/minecraft/command/CommandResultStats$Type;]
	 * </p>
	 */
	public static McObfPair func_179635_a = McMappingDatabase.getSRG("CommandResultStats$Type.func_179635_a");

	/**
	 * <p>
	 * Name: typeID
	 * </p>
	 */
	public static McObfPair field_179639_f = McMappingDatabase.getSRG("field_179639_f");

	/**
	 * <p>
	 * Name: getTypeID
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_179636_a = McMappingDatabase.getSRG("CommandResultStats$Type.func_179636_a");

	/**
	 * <p>
	 * Name: typeName
	 * </p>
	 */
	public static McObfPair field_179640_g = McMappingDatabase.getSRG("field_179640_g");

	/**
	 * <p>
	 * Name: getTypeName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_179637_b = McMappingDatabase.getSRG("CommandResultStats$Type.func_179637_b");

}
