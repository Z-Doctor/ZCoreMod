package zdoctor.zcoremod.map.minecraft.world.storage.loot;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ILootContainer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "uj";
		else
			return "net/minecraft/world/storage/loot/ILootContainer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "uj";
		else
			return "ILootContainer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Luj;";
		else
			return "Lnet/minecraft/world/storage/loot/ILootContainer;";
	}

	/**
	 * <p>
	 * Name: getLootTable
	 * </p>
	 * <p>
	 * Desc: [()Lnet/minecraft/util/ResourceLocation;]
	 * </p>
	 */
	public static McObfPair func_184276_b = McMappingDatabase.getSRG("ILootContainer.func_184276_b");

}
