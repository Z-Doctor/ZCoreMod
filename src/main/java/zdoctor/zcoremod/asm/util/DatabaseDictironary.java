package zdoctor.zcoremod.asm.util;

import zdoctor.commons.util.NodeDictionary;
import zdoctor.commons.util.PrimitiveUtil;
import zdoctor.zcoremod.map.McMappingDatabase;

public class DatabaseDictironary extends NodeDictionary<Character, McMappingDatabase> {


	public McMappingDatabase lookUp(String key) {
		return super.lookUp(PrimitiveUtil.toCharacterArray(key));
	}

	public boolean hasKey(String key) {
		return super.hasKey(PrimitiveUtil.toCharacterArray(key));
	}

	public boolean register(String keys, McMappingDatabase value) {
		return super.register(PrimitiveUtil.toCharacterArray(keys), value);
	}

	@Override
	public Character[][] searchSimilarKeys(Character[] partialKey) {
		return null;
	}

	@Override
	public McMappingDatabase[] searchSimilarValues(McMappingDatabase partialValue) {
		return null;
	}

}
