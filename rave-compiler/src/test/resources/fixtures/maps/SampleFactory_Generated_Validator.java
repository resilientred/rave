package fixtures;

import android.support.annotation.NonNull;
import com.uber.rave.BaseValidator;
import com.uber.rave.ExclusionStrategy;
import com.uber.rave.InvalidModelException;
import com.uber.rave.RaveError;
import fixtures.maps.ModelWithMap;
import java.lang.Class;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.util.List;
import javax.annotation.Generated;

@Generated(
        value = "com.uber.rave.compiler.RaveProcessor",
        comments = "https://github.com/uber-common/rave"
)
public final class SampleFactory_Generated_Validator extends BaseValidator {
    SampleFactory_Generated_Validator() {
        addSupportedClass(ModelWithMap.class);
        registerSelf();
    }

    @Override
    protected void validateAs(@NonNull Object object, @NonNull Class<?> clazz, @NonNull ExclusionStrategy exclusionStrategy) throws InvalidModelException {
        if (!clazz.isInstance(object)) {
            throw new IllegalArgumentException(object.getClass().getCanonicalName() + "is not of type" + clazz.getCanonicalName());
        }
        if (clazz.equals(ModelWithMap.class)) {
            validateAs((ModelWithMap) object, exclusionStrategy);
            return;
        }
        throw new IllegalArgumentException(object.getClass().getCanonicalName() + " is not supported by validator " + this.getClass().getCanonicalName());
    }

    private void validateAs(ModelWithMap object, ExclusionStrategy exclusionStrategy) throws InvalidModelException {
        BaseValidator.ValidationContext context = getValidationContext(ModelWithMap.class);
        List<RaveError> raveErrors = null;
        if (!setContextAndCheckshouldIgnoreMethod(ModelWithMap.class, "getMap", exclusionStrategy, context)) {
            raveErrors = mergeErrors(raveErrors, checkNullable(object.getMap(), true, context));
        }
        if (raveErrors != null && !raveErrors.isEmpty()) {
            throw new InvalidModelException(raveErrors);
        }
    }
}