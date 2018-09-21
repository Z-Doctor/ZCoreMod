package zdoctor.zcoremod.map.minecraft.client.renderer.tileentity;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class TileEntityMobSpawnerRenderer {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxc";
		else
			return "net/minecraft/client/renderer/tileentity/TileEntityMobSpawnerRenderer";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bxc";
		else
			return "TileEntityMobSpawnerRenderer";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbxc;";
		else
			return "Lnet/minecraft/client/renderer/tileentity/TileEntityMobSpawnerRenderer;";
	}

	/**
	 * <p>
	 * Name: renderMob
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/MobSpawnerBaseLogic;DDDF)V]
	 * </p>
	 */
	public static McObfPair func_147517_a = McMappingDatabase.getSRG("TileEntityMobSpawnerRenderer.func_147517_a");

	/**
	 * <p>
	 * Name: render
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/tileentity/TileEntity;DDDFIF)V, (Lnet/minecraft/tileentity/TileEntityMobSpawner;DDDFIF)V]
	 * </p>
	 */
	public static McObfPair func_192841_a = McMappingDatabase.getSRG("TileEntityMobSpawnerRenderer.func_192841_a");

}
