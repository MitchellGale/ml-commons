/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.ml.settings;

import org.opensearch.common.settings.Setting;

public final class MLCommonsSettings {

    private MLCommonsSettings() {}

    public static final Setting<String> ML_COMMONS_TASK_DISPATCH_POLICY = Setting
        .simpleString("plugins.ml_commons.task_dispatch_policy", "round_robin", Setting.Property.NodeScope, Setting.Property.Dynamic);

    public static final Setting<Integer> ML_COMMONS_MAX_MODELS_PER_NODE = Setting
        .intSetting("plugins.ml_commons.max_model_on_node", 10, 0, 10000, Setting.Property.NodeScope, Setting.Property.Dynamic);
    public static final Setting<Integer> ML_COMMONS_MAX_REGISTER_MODEL_TASKS_PER_NODE = Setting
        .intSetting(
            "plugins.ml_commons.max_register_model_tasks_per_node",
            10,
            0,
            10,
            Setting.Property.NodeScope,
            Setting.Property.Dynamic
        );
    public static final Setting<Integer> ML_COMMONS_MAX_DEPLOY_MODEL_TASKS_PER_NODE = Setting
        .intSetting("plugins.ml_commons.max_deploy_model_tasks_per_node", 10, 0, 10, Setting.Property.NodeScope, Setting.Property.Dynamic);
    public static final Setting<Integer> ML_COMMONS_MAX_ML_TASK_PER_NODE = Setting
        .intSetting("plugins.ml_commons.max_ml_task_per_node", 10, 0, 10000, Setting.Property.NodeScope, Setting.Property.Dynamic);
    public static final Setting<Boolean> ML_COMMONS_ONLY_RUN_ON_ML_NODE = Setting
        .boolSetting("plugins.ml_commons.only_run_on_ml_node", true, Setting.Property.NodeScope, Setting.Property.Dynamic);

    // in opensource 2.7 release, we are releasing metrics correlation feature as experimental.
    // by default this algorithm will be disabled. client needs to explicitly enable this setting
    public static final Setting<Boolean> ML_COMMONS_ENABLE_MCORR = Setting
        .boolSetting("plugins.ml_commons.enable_metrics_correlation", false, Setting.Property.NodeScope, Setting.Property.Dynamic);
    public static final Setting<Integer> ML_COMMONS_SYNC_UP_JOB_INTERVAL_IN_SECONDS = Setting
        .intSetting(
            "plugins.ml_commons.sync_up_job_interval_in_seconds",
            3,
            0,
            86400,
            Setting.Property.NodeScope,
            Setting.Property.Dynamic
        );

    public static final Setting<Integer> ML_COMMONS_ML_TASK_TIMEOUT_IN_SECONDS = Setting
        .intSetting("plugins.ml_commons.ml_task_timeout_in_seconds", 600, 1, 86400, Setting.Property.NodeScope, Setting.Property.Dynamic);
    public static final Setting<Long> ML_COMMONS_MONITORING_REQUEST_COUNT = Setting
        .longSetting(
            "plugins.ml_commons.monitoring_request_count",
            100,
            0,
            10_000_000,
            Setting.Property.NodeScope,
            Setting.Property.Dynamic
        );

    public static final Setting<String> ML_COMMONS_TRUSTED_URL_REGEX = Setting
        .simpleString(
            "plugins.ml_commons.trusted_url_regex",
            "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]",
            Setting.Property.NodeScope,
            Setting.Property.Dynamic
        );

    public static final Setting<Integer> ML_COMMONS_NATIVE_MEM_THRESHOLD = Setting
        .intSetting("plugins.ml_commons.native_memory_threshold", 90, 0, 100, Setting.Property.NodeScope, Setting.Property.Dynamic);

    public static final Setting<String> ML_COMMONS_EXCLUDE_NODE_NAMES = Setting
        .simpleString("plugins.ml_commons.exclude_nodes._name", Setting.Property.NodeScope, Setting.Property.Dynamic);
    public static final Setting<Boolean> ML_COMMONS_ALLOW_CUSTOM_DEPLOYMENT_PLAN = Setting
        .boolSetting("plugins.ml_commons.allow_custom_deployment_plan", false, Setting.Property.NodeScope, Setting.Property.Dynamic);

    public static final Setting<Boolean> ML_COMMONS_MODEL_AUTO_REDEPLOY_ENABLE = Setting
        .boolSetting("plugins.ml_commons.model_auto_redeploy.enable", false, Setting.Property.NodeScope, Setting.Property.Dynamic);

    public static final Setting<Integer> ML_COMMONS_MODEL_AUTO_REDEPLOY_LIFETIME_RETRY_TIMES = Setting
        .intSetting("plugins.ml_commons.model_auto_redeploy.lifetime_retry_times", 3, Setting.Property.NodeScope, Setting.Property.Dynamic);

    public static final Setting<Float> ML_COMMONS_MODEL_AUTO_REDEPLOY_SUCCESS_RATIO = Setting
        .floatSetting(
            "plugins.ml_commons.model_auto_redeploy_success_ratio",
            0.8f,
            0f,
            1f,
            Setting.Property.NodeScope,
            Setting.Property.Dynamic
        );
}
