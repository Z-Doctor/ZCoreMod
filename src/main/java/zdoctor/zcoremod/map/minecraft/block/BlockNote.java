package zdoctor.zcoremod.map.minecraft.block;

import zdoctor.zcoremod.CoreModFMLLoadPlugin;
import zdoctor.zcoremod.map.pair.McObfPair;
import zdoctor.zcoremod.map.McMappingDatabase;

public class BlockNote {

	public static String getKey() {
		return getClassName().replaceAll("/", ".");
	}

	public static String getClassName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ask";
		else
			return "net/minecraft/block/BlockNote";
	}

	public static String getName() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "ask";
		else
			return "BlockNote";
	}

	public static String getDescriptor() {
		if (CoreModFMLLoadPlugin.isObfuscated)
			return "Lask;";
		else
			return "Lnet/minecraft/block/BlockNote;";
	}

	/**
	 * <p>
	 * Name: eventReceived
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;II)Z]
	 * </p>
	 */
	public static McObfPair func_189539_a = McMappingDatabase.getSRG("BlockNote.func_189539_a");

	/**
	 * <p>
	 * Name: onBlockActivated
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;Lnet/minecraft/util/EnumFacing;FFF)Z]
	 * </p>
	 */
	public static McObfPair func_180639_a = McMappingDatabase.getSRG("BlockNote.func_180639_a");

	/**
	 * <p>
	 * Name: neighborChanged
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/Block;Lnet/minecraft/util/math/BlockPos;)V]
	 * </p>
	 */
	public static McObfPair func_189540_a = McMappingDatabase.getSRG("BlockNote.func_189540_a");

	/**
	 * <p>
	 * Name: getRenderType
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/block/state/IBlockState;)Lnet/minecraft/util/EnumBlockRenderType;]
	 * </p>
	 */
	public static McObfPair func_149645_b = McMappingDatabase.getSRG("BlockNote.func_149645_b");

	/**
	 * <p>
	 * Name: getInstrument
	 * </p>
	 * <p>
	 * Desc: [(I)Lnet/minecraft/util/SoundEvent;]
	 * </p>
	 */
	public static McObfPair func_185576_e = McMappingDatabase.getSRG("BlockNote.func_185576_e");

	/**
	 * <p>
	 * Name: onBlockClicked
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/EntityPlayer;)V]
	 * </p>
	 */
	public static McObfPair func_180649_a = McMappingDatabase.getSRG("BlockNote.func_180649_a");

	/**
	 * <p>
	 * Name: INSTRUMENTS
	 * </p>
	 */
	public static McObfPair field_176434_a = McMappingDatabase.getSRG("field_176434_a");

	/**
	 * <p>
	 * Name: createNewTileEntity
	 * </p>
	 * <p>
	 * Desc: [(Lnet/minecraft/world/World;I)Lnet/minecraft/tileentity/TileEntity;]
	 * </p>
	 */
	public static McObfPair func_149915_a = McMappingDatabase.getSRG("BlockNote.func_149915_a");

}
