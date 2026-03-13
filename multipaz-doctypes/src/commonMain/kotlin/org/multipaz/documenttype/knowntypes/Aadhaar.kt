package org.multipaz.documenttype.knowntypes

import org.multipaz.cbor.toDataItem
import org.multipaz.cbor.toDataItemFullDate
import org.multipaz.documenttype.DocumentAttributeType
import org.multipaz.documenttype.DocumentType
import org.multipaz.documenttype.Icon
import org.multipaz.util.fromBase64Url
import kotlinx.datetime.LocalDate

/**
 * Object containing the metadata of the Aadhaar Document Type.
 */
object Aadhaar {
    const val AADHAAR_DOCTYPE = "in.gov.uidai.aadhaar.1"
    const val AADHAAR_NAMESPACE = "in.gov.uidai.aadhaar.1"

    /**
     * Build the Aadhaar Document Type.
     */
    fun getDocumentType(): DocumentType {
        return DocumentType.Builder("Aadhaar")
            .addMdocDocumentType(AADHAAR_DOCTYPE)
            .addMdocAttribute(
                DocumentAttributeType.Date,
                "credential_issuing_date",
                "Credential Issuing Date",
                "Date of credential issuance",
                false,
                AADHAAR_NAMESPACE,
                Icon.CALENDAR_CLOCK,
                LocalDate.parse("2023-01-01").toDataItemFullDate()
            )
            .addMdocAttribute(
                DocumentAttributeType.Date,
                "enrolment_date",
                "Enrolment Date",
                "Date of enrolment",
                false,
                AADHAAR_NAMESPACE,
                Icon.TODAY,
                LocalDate.parse("2023-01-01").toDataItemFullDate()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "enrolment_number",
                "Enrolment Number",
                "Enrolment number",
                false,
                AADHAAR_NAMESPACE,
                Icon.NUMBERS,
                "1234567890".toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.Boolean,
                "is_nri",
                "Is NRI",
                "Resident is NRI",
                false,
                AADHAAR_NAMESPACE,
                Icon.GLOBE,
                false.toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.Picture,
                "resident_image",
                "Photo",
                "Photo of the resident",
                false,
                AADHAAR_NAMESPACE,
                Icon.ACCOUNT_BOX,
                SampleData.PORTRAIT_BASE64URL.fromBase64Url().toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "resident_name",
                "Name",
                "Resident Name",
                false,
                AADHAAR_NAMESPACE,
                Icon.PERSON,
                SampleData.GIVEN_NAME.toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "local_resident_name",
                "Local Name",
                "Resident Name in Local Language",
                false,
                AADHAAR_NAMESPACE,
                Icon.PERSON,
                SampleData.GIVEN_NAME.toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.Boolean,
                "age_above18",
                "Age Above 18",
                "Age Above 18",
                false,
                AADHAAR_NAMESPACE,
                Icon.TODAY,
                true.toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.Boolean,
                "age_above50",
                "Age Above 50",
                "Age Above 50",
                false,
                AADHAAR_NAMESPACE,
                Icon.TODAY,
                true.toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.Boolean,
                "age_above60",
                "Age Above 60",
                "Age Above 60",
                false,
                AADHAAR_NAMESPACE,
                Icon.TODAY,
                true.toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.Boolean,
                "age_above75",
                "Age Above 75",
                "Age Above 75",
                false,
                AADHAAR_NAMESPACE,
                Icon.TODAY,
                true.toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.Date,
                "dob",
                "Date of Birth",
                "Date of Birth",
                false,
                AADHAAR_NAMESPACE,
                Icon.TODAY,
                LocalDate.parse("1990-01-01").toDataItemFullDate()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "gender",
                "Gender",
                "Gender",
                false,
                AADHAAR_NAMESPACE,
                Icon.PERSON,
                "M".toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "building",
                "Building",
                "Building",
                false,
                AADHAAR_NAMESPACE,
                Icon.PLACE,
                "Building 1".toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "local_building",
                "Local Building",
                "Local Building",
                false,
                AADHAAR_NAMESPACE,
                Icon.PLACE,
                "Building 1".toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "locality",
                "Locality",
                "Locality",
                false,
                AADHAAR_NAMESPACE,
                Icon.PLACE,
                "Locality 1".toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "local_locality",
                "Local Locality",
                "Local Locality",
                false,
                AADHAAR_NAMESPACE,
                Icon.PLACE,
                "Locality 1".toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "street",
                "Street",
                "Street",
                false,
                AADHAAR_NAMESPACE,
                Icon.PLACE,
                "Street 1".toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "local_street",
                "Local Street",
                "Local Street",
                false,
                AADHAAR_NAMESPACE,
                Icon.PLACE,
                "Street 1".toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "landmark",
                "Landmark",
                "Landmark",
                false,
                AADHAAR_NAMESPACE,
                Icon.PLACE,
                "Landmark 1".toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "local_landmark",
                "Local Landmark",
                "Local Landmark",
                false,
                AADHAAR_NAMESPACE,
                Icon.PLACE,
                "Landmark 1".toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "vtc",
                "VTC",
                "Village/Town/City",
                false,
                AADHAAR_NAMESPACE,
                Icon.PLACE,
                "VTC".toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "local_vtc",
                "Local VTC",
                "Local Village/Town/City",
                false,
                AADHAAR_NAMESPACE,
                Icon.PLACE,
                "VTC".toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "sub_district",
                "Sub-District",
                "Sub-District",
                false,
                AADHAAR_NAMESPACE,
                Icon.PLACE,
                "Sub-District".toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "local_sub_district",
                "Local Sub-District",
                "Local Sub-District",
                false,
                AADHAAR_NAMESPACE,
                Icon.PLACE,
                "Sub-District".toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "district",
                "District",
                "District",
                false,
                AADHAAR_NAMESPACE,
                Icon.PLACE,
                "District".toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "local_district",
                "Local District",
                "Local District",
                false,
                AADHAAR_NAMESPACE,
                Icon.PLACE,
                "District".toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "state",
                "State",
                "State",
                false,
                AADHAAR_NAMESPACE,
                Icon.PLACE,
                SampleData.RESIDENT_STATE.toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "local_state",
                "Local State",
                "Local State",
                false,
                AADHAAR_NAMESPACE,
                Icon.PLACE,
                SampleData.RESIDENT_STATE.toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "po_name",
                "PO Name",
                "Post Office Name",
                false,
                AADHAAR_NAMESPACE,
                Icon.PLACE,
                "PO Name".toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "local_po_name",
                "Local PO Name",
                "Local Post Office Name",
                false,
                AADHAAR_NAMESPACE,
                Icon.PLACE,
                "PO Name".toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "pincode",
                "Pincode",
                "Pincode",
                false,
                AADHAAR_NAMESPACE,
                Icon.PLACE,
                SampleData.RESIDENT_POSTAL_CODE.toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "address",
                "Address",
                "Address",
                false,
                AADHAAR_NAMESPACE,
                Icon.PLACE,
                SampleData.RESIDENT_ADDRESS.toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "local_address",
                "Local Address",
                "Local Address",
                false,
                AADHAAR_NAMESPACE,
                Icon.PLACE,
                SampleData.RESIDENT_ADDRESS.toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "mobile",
                "Mobile",
                "Mobile",
                false,
                AADHAAR_NAMESPACE,
                Icon.PHONE,
                "1234567890".toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "masked_mobile",
                "Masked Mobile",
                "Masked Mobile",
                false,
                AADHAAR_NAMESPACE,
                Icon.PHONE,
                "XXXXXX7890".toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "email",
                "Email",
                "Email",
                false,
                AADHAAR_NAMESPACE,
                Icon.EMAIL,
                SampleData.EMAIL_ADDRESS.toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "masked_email",
                "Masked Email",
                "Masked Email",
                false,
                AADHAAR_NAMESPACE,
                Icon.EMAIL,
                "a***a@example.com".toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "masked_uid",
                "Masked UID",
                "Masked UID",
                false,
                AADHAAR_NAMESPACE,
                Icon.NUMBERS,
                "XXXXXXXX1234".toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.String,
                "aadhaar_type",
                "Type",
                "Type",
                false,
                AADHAAR_NAMESPACE,
                Icon.BADGE,
                "Resident".toDataItem()
            )
            .addMdocAttribute(
                DocumentAttributeType.Date,
                "expires_on",
                "Expires On",
                "Expires On",
                false,
                AADHAAR_NAMESPACE,
                Icon.CALENDAR_CLOCK,
                LocalDate.parse(SampleData.EXPIRY_DATE).toDataItemFullDate()
            )
            .build()
    }
}
