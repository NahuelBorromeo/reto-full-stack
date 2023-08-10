import { DemoContainer } from '@mui/x-date-pickers/internals/demo';
import { AdapterDayjs } from '@mui/x-date-pickers/AdapterDayjs';
import { LocalizationProvider } from '@mui/x-date-pickers/LocalizationProvider';
import { DatePicker } from '@mui/x-date-pickers/DatePicker';
import { useState } from 'react';
import "dayjs/locale/es";
import dayjs from 'dayjs';
import { GridInfo } from './GridInfo';
import { Button } from '@mui/material';
import { useFetch } from '../hooks/useFetch';
import { getVentaData } from '../helper/getVentaData';


export const DateFilter = () => {

  const [value, setValue] = useState(dayjs());


  let url = `http://localhost:8080/venta/findByFecha?fecha=${dayjs(value).format('YYYY-MM-DD')}`;
  const { data, isLoading } = useFetch(url);
  
  // console.log('fecha formateada', dayjs(data[0].fecha).format('DD-MM-YYYY'));


  return (
    <>
      <div style={{ display: 'flex', marginTop: '20px', alignItems: 'center', justifyContent: 'flex-end', marginRight: '10%', marginBottom: '20px'}}>
        <LocalizationProvider dateAdapter={AdapterDayjs} adapterLocale='es'>
          <DemoContainer components={['DatePicker']}>
            <DatePicker
              label="Seleccione la fecha de ventas"
              value={value}
              onChange={(newValue) => setValue(newValue)}
              />
          </DemoContainer>
        </LocalizationProvider>
        <Button variant='contained' style={{marginLeft: '20px'}}>Buscar</Button>
      </div>

      {
        isLoading ?
           'Loading...'
          :
          <GridInfo
            rows={ getVentaData(data) }
          />
      }
    </>

  )
}
