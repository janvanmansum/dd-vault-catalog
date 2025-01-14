/*
 * Copyright (C) 2022 DANS - Data Archiving and Networked Services (info@dans.knaw.nl)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nl.knaw.dans.catalog.core.mapper;

import nl.knaw.dans.catalog.db.OcflObjectVersion;
import nl.knaw.dans.openapi.api.OcflObjectDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OcflObjectVersionMapper {
    OcflObjectVersionMapper INSTANCE = Mappers.getMapper(OcflObjectVersionMapper.class);

//    @Mapping(expression = "java(JsonMapper.toJson(ocflObjectVersion.getMetadata()))", target = "metadata")
    @Mapping(source = "id.bagId", target = "bagId")
    @Mapping(source = "id.versionMajor", target = "versionMajor")
    @Mapping(source = "id.versionMinor", target = "versionMinor")
    OcflObjectDto ocflObjectVersionToOcflObjectDto(OcflObjectVersion ocflObjectVersion);

}

