package gov.usgs.wma.wqp.openapi.annotation.path;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import gov.usgs.wma.wqp.parameter.FilterParameters;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;

@Retention(RUNTIME)
@Target({ METHOD, ANNOTATION_TYPE })
@Parameter(
		in = ParameterIn.PATH,
		name = FilterParameters.ORGANIZATION_CONST,
		description = "Case-sensitive Organization Identifier.",
		schema = @Schema(type = "string"),
		required = true
)
public @interface Organization {

}
