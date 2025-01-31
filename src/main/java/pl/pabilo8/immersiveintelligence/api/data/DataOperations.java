package pl.pabilo8.immersiveintelligence.api.data;

import pl.pabilo8.immersiveintelligence.api.data.operators.DataOperator;
import pl.pabilo8.immersiveintelligence.api.data.operators.advanced_arithmetic.DataOperationMax;
import pl.pabilo8.immersiveintelligence.api.data.operators.advanced_arithmetic.DataOperationMin;
import pl.pabilo8.immersiveintelligence.api.data.operators.advanced_arithmetic.DataOperationPower;
import pl.pabilo8.immersiveintelligence.api.data.operators.advanced_arithmetic.DataOperationRoot;
import pl.pabilo8.immersiveintelligence.api.data.operators.advanced_logic.DataOperationNAND;
import pl.pabilo8.immersiveintelligence.api.data.operators.advanced_logic.DataOperationNOR;
import pl.pabilo8.immersiveintelligence.api.data.operators.advanced_logic.DataOperationXNOR;
import pl.pabilo8.immersiveintelligence.api.data.operators.advanced_logic.DataOperationXOR;
import pl.pabilo8.immersiveintelligence.api.data.operators.arithmetic.*;
import pl.pabilo8.immersiveintelligence.api.data.operators.array.DataOperationGet;
import pl.pabilo8.immersiveintelligence.api.data.operators.array.DataOperationPop;
import pl.pabilo8.immersiveintelligence.api.data.operators.array.DataOperationPush;
import pl.pabilo8.immersiveintelligence.api.data.operators.comparators.*;
import pl.pabilo8.immersiveintelligence.api.data.operators.document.*;
import pl.pabilo8.immersiveintelligence.api.data.operators.entity.*;
import pl.pabilo8.immersiveintelligence.api.data.operators.itemstack.*;
import pl.pabilo8.immersiveintelligence.api.data.operators.logic.DataOperationAND;
import pl.pabilo8.immersiveintelligence.api.data.operators.logic.DataOperationNOT;
import pl.pabilo8.immersiveintelligence.api.data.operators.logic.DataOperationOR;
import pl.pabilo8.immersiveintelligence.api.data.operators.text.*;
import pl.pabilo8.immersiveintelligence.api.data.operators.type_conversion.*;

import javax.annotation.Nonnull;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Pabilo8
 * @since 05-07-2019
 */
public class DataOperations
{
	public static final Map<String, Class<? extends DataOperator>> operations = new HashMap<>();

	static
	{
		operations.put("add", DataOperationAdd.class);
		operations.put("subtract", DataOperationSubtract.class);
		operations.put("multiply", DataOperationMultiply.class);
		operations.put("divide", DataOperationDivide.class);
		operations.put("modulo", DataOperationModulo.class);

		operations.put("power", DataOperationPower.class);
		operations.put("root", DataOperationRoot.class);
		operations.put("max", DataOperationMax.class);
		operations.put("min", DataOperationMin.class);

		operations.put("greater", DataOperationGreater.class);
		operations.put("less", DataOperationLess.class);
		operations.put("greater_or_equal", DataOperationGreaterOrEqual.class);
		operations.put("less_or_equal", DataOperationLessOrEqual.class);
		operations.put("equal", DataOperationEqual.class);

		operations.put("and", DataOperationAND.class);
		operations.put("or", DataOperationOR.class);
		operations.put("not", DataOperationNOT.class);

		operations.put("nand", DataOperationNAND.class);
		operations.put("nor", DataOperationNOR.class);
		operations.put("xor", DataOperationXOR.class);
		operations.put("xnor", DataOperationXNOR.class);

		operations.put("string_join", DataOperationStringJoin.class);
		operations.put("string_equal", DataOperationStringEqual.class);
		operations.put("string_split", DataOperationStringSplit.class);
		operations.put("string_length", DataOperationStringLength.class);
		operations.put("string_char_at", DataOperationStringCharAt.class);
		operations.put("string_substring", DataOperationStringSubstring.class);
		operations.put("string_trim", DataOperationStringTrim.class);
		operations.put("string_hexcol", DataOperationStringHexcol.class);
		operations.put("string_format", DataOperationStringFormat.class);
		operations.put("string_contains", DataOperationStringContains.class);
		operations.put("string_contains_count", DataOperationStringContainsCount.class);
		operations.put("string_lowercase", DataOperationStringLowerCase.class);
		operations.put("string_uppercase", DataOperationStringUpperCase.class);
		operations.put("string_snake_case", DataOperationStringSnakeCase.class);
		operations.put("string_camel_case", DataOperationStringCamelCase.class);
		operations.put("string_reverse", DataOperationStringReverse.class);

		operations.put("get_quantity", DataOperationGetQuantity.class);
		operations.put("set_quantity", DataOperationSetQuantity.class);
		operations.put("get_durability", DataOperationGetDurability.class);
		operations.put("set_durability", DataOperationSetDurability.class);
		operations.put("get_nbt", DataOperationGetNBT.class);
		operations.put("set_nbt", DataOperationSetNBT.class);
		operations.put("get_item_id", DataOperationGetItemID.class);
		operations.put("get_itemstack", DataOperationGetItemStack.class);
		operations.put("is_stack_empty", DataOperationIsStackEmpty.class);
		operations.put("can_stack_with", DataOperationCanStackWith.class);
		operations.put("matches_oredict", DataOperationMatchesOreDictionary.class);

		operations.put("entity_get_id", DataOperationGetEntityID.class);
		operations.put("entity_get_type", DataOperationGetEntityType.class);
		operations.put("entity_get_name", DataOperationGetEntityName.class);
		operations.put("entity_get_dimension_id", DataOperationGetEntityDimensionID.class);
		operations.put("entity_get_x", DataOperationGetEntityPosX.class);
		operations.put("entity_get_y", DataOperationGetEntityPosY.class);
		operations.put("entity_get_z", DataOperationGetEntityPosZ.class);

		operations.put("array_get", DataOperationGet.class);
		operations.put("array_pop", DataOperationPop.class);
		operations.put("array_push", DataOperationPush.class);

		operations.put("document_read_page", DataOperationDocumentReadPage.class);
		operations.put("document_read_all_pages_array", DataOperationDocumentReadAllPagesArray.class);
		operations.put("document_read_all_pages_string", DataOperationDocumentReadAllPagesString.class);
		operations.put("document_get_author", DataOperationDocumentGetAuthor.class);
		operations.put("document_get_title", DataOperationDocumentGetTitle.class);

		operations.put("is_null", DataOperationIsNull.class);
		operations.put("to_integer", DataOperationToInteger.class);
		operations.put("to_string", DataOperationToString.class);
		operations.put("to_boolean", DataOperationToBoolean.class);
		operations.put("to_null", DataOperationToNull.class);


	}

	@Nonnull
	public static DataOperator getOperatorInstance(String name)
	{
		Class<? extends DataOperator> c = operations.get(name);
		if(c!=null)
		{
			try
			{
				return c.newInstance();
			}
			catch(InstantiationException|IllegalAccessException ignored)
			{

			}
		}
		return new DataOperationAdd();
	}

}
