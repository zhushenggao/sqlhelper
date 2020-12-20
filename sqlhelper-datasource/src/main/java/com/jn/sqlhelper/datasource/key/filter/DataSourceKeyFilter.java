package com.jn.sqlhelper.datasource.key.filter;

import com.jn.langx.Named;
import com.jn.langx.Ordered;
import com.jn.langx.annotation.NonNull;
import com.jn.langx.util.function.Supplier;
import com.jn.sqlhelper.datasource.key.DataSourceKey;

import java.util.List;

public interface DataSourceKeyFilter extends Supplier<List<DataSourceKey>, DataSourceKey>, Named, Ordered {
    /**
     * 可应用与哪些 group
     * @return
     */
    @NonNull
    List<String> applyTo();
}
