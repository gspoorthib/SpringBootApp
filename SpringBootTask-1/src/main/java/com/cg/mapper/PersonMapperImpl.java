package com.cg.mapper;

import com.cg.dto.PersonDto;
import com.cg.vo.Person;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-02T16:31:33+0530",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 15.0.2 (Oracle Corporation)"
)
@Component
public class PersonMapperImpl implements PersonMapper {

    @Override
    public PersonDto convertToDto(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonDto personDto = new PersonDto();

        personDto.setName( person.getName() );
        personDto.setAge( person.getAge() );
        personDto.setCity( person.getCity() );

        return personDto;
    }

    @Override
    public Person convertToVo(PersonDto persondto) {
        if ( persondto == null ) {
            return null;
        }

        Person person = new Person();

        person.setName( persondto.getName() );
        person.setAge( persondto.getAge() );
        person.setCity( persondto.getCity() );

        return person;
    }

    @Override
    public List<Person> convertToVoList(List<PersonDto> personList) {
        if ( personList == null ) {
            return null;
        }

        List<Person> list = new ArrayList<Person>( personList.size() );
        for ( PersonDto personDto : personList ) {
            list.add( convertToVo( personDto ) );
        }

        return list;
    }
}
