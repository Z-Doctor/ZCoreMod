package zdoctor.zcoremod.map.minecraft.entity.player;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class EntityPlayer$EnumChatVisibility {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aed$b";
		else
			return "net/minecraft/entity/player/EntityPlayer$EnumChatVisibility";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aed$b";
		else
			return "EntityPlayer$EnumChatVisibility";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laed$b;";
		else
			return "Lnet/minecraft/entity/player/EntityPlayer$EnumChatVisibility;";
	}

	/**
	 * <p>
	 * Name: chatVisibility
	 * </p>
	 */
	public static McObfPair field_151433_e = McMappingDatabase.getSRG("field_151433_e");

	/**
	 * <p>
	 * Name: getResourceKey
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_151429_b = McMappingDatabase.getSRG("EntityPlayer$EnumChatVisibility.func_151429_b");

	/**
	 * <p>
	 * Name: resourceKey
	 * </p>
	 */
	public static McObfPair field_151430_f = McMappingDatabase.getSRG("field_151430_f");

	/**
	 * <p>
	 * Name: ID_LOOKUP
	 * </p>
	 */
	public static McObfPair field_151432_d = McMappingDatabase.getSRG("field_151432_d");

	/**
	 * <p>
	 * Name: getChatVisibility
	 * </p>
	 * <p>
	 * Desc: [()I]
	 * </p>
	 */
	public static McObfPair func_151428_a = McMappingDatabase.getSRG("EntityPlayer$EnumChatVisibility.func_151428_a");

	/**
	 * <p>
	 * Name: getEnumChatVisibility
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/entity/player/EntityPlayer$EnumChatVisibility;]
	 * </p>
	 */
	public static McObfPair func_151426_a = McMappingDatabase.getSRG("EntityPlayer$EnumChatVisibility.func_151426_a");

}
