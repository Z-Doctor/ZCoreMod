package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class MapGenMineshaft$Type {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbj$a";
		else
			return "net/minecraft/world/gen/structure/MapGenMineshaft$Type";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbj$a";
		else
			return "MapGenMineshaft$Type";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbj$a;";
		else
			return "Lnet/minecraft/world/gen/structure/MapGenMineshaft$Type;";
	}

	/**
	 * <p>
	 * Name: byId
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/world/gen/structure/MapGenMineshaft$Type;]
	 * </p>
	 */
	public static McObfPair func_189910_a = McMappingDatabase.getSRG("MapGenMineshaft$Type.func_189910_a");

}
