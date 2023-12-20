package com.youssef.ecommerce.app.jdbc.services.interfaces;

import com.youssef.ecommerce.app.jdbc.entities.Category;
import com.youssef.ecommerce.app.jdbc.models.requests.AddCategoryRequestBody;
import com.youssef.ecommerce.app.jdbc.models.requests.UpdateCategoryRequestBody;
import com.youssef.ecommerce.app.jdbc.models.responses.AddCategoryResponseBody;
import com.youssef.ecommerce.app.jdbc.models.responses.FindCategoryByIdResponse;

public interface CategoryServiceInterface {
    AddCategoryResponseBody addNewCategory(AddCategoryRequestBody categoryRequestBody);

    boolean isCategoryExistsById(Integer categoryId);

    FindCategoryByIdResponse findById(Integer categoryId);

    boolean deleteById(Integer categoryId);

    boolean updateCategoryById(Integer categoryId, UpdateCategoryRequestBody updateCategoryRequestBody);

}
