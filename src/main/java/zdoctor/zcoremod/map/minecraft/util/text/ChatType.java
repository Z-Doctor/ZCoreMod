package zdoctor.zcoremod.map.minecraft.util.text;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ChatType {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hf";
		else
			return "net/minecraft/util/text/ChatType";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "hf";
		else
			return "ChatType";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lhf;";
		else
			return "Lnet/minecraft/util/text/ChatType;";
	}

	/**
	 * <p>
	 * Name: byId
	 * </p>
	 * <p>
	 * Desc: [(B)Lnet/minecraft/util/text/ChatType;]
	 * </p>
	 */
	public static McObfPair func_192582_a = McMappingDatabase.getSRG("ChatType.func_192582_a");

	/**
	 * <p>
	 * Name: getId
	 * </p>
	 * <p>
	 * Desc: [()B]
	 * </p>
	 */
	public static McObfPair func_192583_a = McMappingDatabase.getSRG("ChatType.func_192583_a");

	/**
	 * <p>
	 * Name: id
	 * </p>
	 */
	public static McObfPair field_192588_d = McMappingDatabase.getSRG("field_192588_d");

}
