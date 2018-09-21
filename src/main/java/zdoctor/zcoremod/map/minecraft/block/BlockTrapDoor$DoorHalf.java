package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockTrapDoor$DoorHalf {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aur$a";
		else
			return "net/minecraft/block/BlockTrapDoor$DoorHalf";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aur$a";
		else
			return "BlockTrapDoor$DoorHalf";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laur$a;";
		else
			return "Lnet/minecraft/block/BlockTrapDoor$DoorHalf;";
	}

	/**
	 * <p>
	 * Name: name
	 * </p>
	 */
	public static McObfPair field_176671_c = McMappingDatabase.getSRG("field_176671_c");

	/**
	 * <p>
	 * Name: getName
	 * </p>
	 * <p>
	 * Desc: [()Ljava/lang/String;]
	 * </p>
	 */
	public static McObfPair func_176610_l = McMappingDatabase.getSRG("BlockTrapDoor$DoorHalf.func_176610_l");

}
