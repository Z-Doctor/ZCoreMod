package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class ITileEntityProvider {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aql";
		else
			return "net/minecraft/block/ITileEntityProvider";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "aql";
		else
			return "ITileEntityProvider";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Laql;";
		else
			return "Lnet/minecraft/block/ITileEntityProvider;";
	}

	/**
	 * <p>
	 * Name: createNewTileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;I)Lnet/minecraft/tileentity/TileEntity;]
	 * </p>
	 */
	public static McObfPair func_149915_a = McMappingDatabase.getSRG("ITileEntityProvider.func_149915_a");

}
