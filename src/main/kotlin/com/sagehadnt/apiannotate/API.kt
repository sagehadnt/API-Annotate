package com.sagehadnt.apiannotate

/**
 * Indicates that this element is intended to be consumed externally, even if it's not used in the current project.
 *
 * You can configure your IDE to ignore "this element is unused" warnings for elements with this annotation.
 * For IntelliJ:
 * 1. On the element with the warning, open the actions menu (Alt+Enter by default)
 * 2. Select "suppress unused warning if annotated by com.sagehadnt.apiannotate.API"
 *
 * This helps avoid false positives on unused elements.
 */
@Target(
    AnnotationTarget.FIELD,
    AnnotationTarget.FUNCTION,
    AnnotationTarget.CLASS,
    AnnotationTarget.PROPERTY,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.CONSTRUCTOR
)
@Retention(AnnotationRetention.SOURCE)
annotation class API