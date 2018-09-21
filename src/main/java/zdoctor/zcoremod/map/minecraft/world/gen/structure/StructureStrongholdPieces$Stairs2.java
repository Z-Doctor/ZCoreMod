package zdoctor.zcoremod.map.minecraft.world.gen.structure;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class StructureStrongholdPieces$Stairs2 {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbt$m";
		else
			return "net/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "bbt$m";
		else
			return "StructureStrongholdPieces$Stairs2";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lbbt$m;";
		else
			return "Lnet/minecraft/world/gen/structure/StructureStrongholdPieces$Stairs2;";
	}

	/**
	 * <p>
	 * Name: lastPlaced
	 * </p>
	 */
	public static McObfPair field_75027_a = McMappingDatabase.getSRG("field_75027_a");

	/**
	 * <p>
	 * Name: pendingChildren
	 * </p>
	 */
	public static McObfPair field_75026_c = McMappingDatabase.getSRG("field_75026_c");

	/**
	 * <p>
	 * Name: strongholdPortalRoom
	 * </p>
	 */
	public static McObfPair field_75025_b = McMappingDatabase.getSRG("field_75025_b");

}
