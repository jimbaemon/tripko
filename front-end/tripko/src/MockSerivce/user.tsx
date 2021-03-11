import mocker from 'mocker-data-generator';

const user = {
  user_id: {
    chance: 'guid',
  },
  username: {
    faker: 'name.firstName',
  },
  password: {
    faker: 'internet.password',
  },
  name: {
    faker: 'name.firstName',
  },
  email: {
    faker: 'internet.email',
  },
  authority: {
    faker: 'random.number({"min":1, "max":3})',
  },
  created_at: {
    faker: 'date.past',
  },
  description: {
    faker: 'lorem.sentence',
  },
  thumbnail: {
    faker: 'internet.avatar',
  },
  facebook: {
    faker: 'internet.url',
  },
  website: {
    faker: 'internet.url',
  },
  instagram: {
    faker: 'internet.url',
  },
  deleted_by: {
    chance: 'guid',
  },
  modified_by: {
    chance: 'guid',
  },
  deleted_at: {
    faker: 'date.past',
  },
};

export const getUsers = () =>
  // eslint-disable-next-line implicit-arrow-linebreak
  mocker()
    .schema('payload', user, 100)
    .build((err, data) => {
      // eslint-disable-next-line no-console
      console.log(data);
      return data;
    });
